package com.android.internal.telephony.fullnetwork;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.telephony.HwTelephonyManagerInner;
import android.telephony.HwTelephonyManagerInnerUtils;
import com.android.internal.telephony.HwNetworkTypeUtils;
import com.android.internal.telephony.HwSubscriptionManager;
import com.huawei.android.telephony.RlogEx;
import com.huawei.android.telephony.SubscriptionManagerEx;
import com.huawei.internal.telephony.CommandsInterfaceEx;
import com.huawei.internal.telephony.PhoneExt;
import com.huawei.internal.telephony.PhoneFactoryExt;
import com.huawei.internal.telephony.ProxyControllerEx;
import com.huawei.internal.telephony.RadioCapabilityEx;

public class HwFullNetworkSetStateMtk extends HwFullNetworkSetStateQcomMtkBase {
    private static final String LOG_TAG = "HwFullNetworkSetStateMtk";
    private static final String MAIN_STACK = "modem_sys1_ps0";

    HwFullNetworkSetStateMtk(Context c, CommandsInterfaceEx[] ci, Handler h) {
        super(c, ci, h);
        this.mChipOther = HwFullNetworkChipOther.getInstance();
        RlogEx.i(LOG_TAG, "HwFullNetworkSetStateMtk constructor, support dual nr: " + HwTelephonyManagerInnerUtils.getDefault().isDualNrSupported() + ", state:" + HwNetworkTypeUtils.isDualNrSwitchOpened(this.mContext));
    }

    @Override // com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateQcomMtkBase, com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateBase
    public void setMainSlot(int slotId, Message response) {
        this.mChipCommon.expectedDDSsubId = slotId;
        this.isSwitchSlot = slotId != this.mChipCommon.getUserSwitchDualCardSlots();
        if (!isNeedSetRadioCapability(slotId)) {
            loge("setDefault4GSlot: there is no need to set the lte slot, isSwitchSlot = " + this.isSwitchSlot);
            if (this.isSwitchSlot) {
                prepareBeforeSwitch(slotId, response);
                sendSetRadioCapabilitySuccess(!this.mChipCommon.isDualImsSwitchOpened());
                return;
            }
            this.mChipCommon.saveMainCardIccId(this.mChipCommon.getIccId(slotId));
            this.mChipCommon.isSet4GSlotInProgress = false;
            this.mChipOther.setServiceAbility();
            logd("set DDS to slot: " + slotId);
            HwTelephonyManagerInner.getDefault().setDefaultDataSlotId(slotId);
            HwSubscriptionManager.getInstance().setUserPrefDefaultSlotId(slotId);
            int needSetCount = PhoneFactoryExt.onDataSubChange();
            logd("needSetCount = " + needSetCount + "; mNeedSetAllowData = " + this.mChipOther.mNeedSetAllowData);
            if (needSetCount == 0 && this.mChipOther.mNeedSetAllowData) {
                this.mChipOther.mNeedSetAllowData = false;
                for (int i = 0; i < HwFullNetworkConstantsInner.SIM_NUM; i++) {
                    PhoneFactoryExt.resendDataAllowed(i);
                    logd("setDefault4GSlot resend data allow with slot " + i);
                }
            }
            this.mChipCommon.sendResponseToTarget(this.mChipCommon.mSet4GSlotCompleteMsg, 0);
            this.mChipCommon.mSet4GSlotCompleteMsg = null;
            this.mStateHandler.obtainMessage(HwFullNetworkConstantsInner.EVENT_TRANS_TO_DEFAULT).sendToTarget();
        } else if (this.mCis[slotId] == null || 2 != this.mCis[slotId].getRadioState()) {
            prepareBeforeSwitch(slotId, response);
            if (this.isSwitchSlot) {
                this.mChipOther.setPropertyIfNecessary();
            }
            logd("setDefault4GSlot:setMaxRadioCapability, slotId = " + slotId);
            ProxyControllerEx.getInstance().setRadioCapability(slotId, slotId);
        } else {
            loge("setDefault4GSlot: radio is unavailable, return with failure");
            this.mChipCommon.sendResponseToTarget(response, 2);
            this.mChipCommon.mSet4GSlotCompleteMsg = null;
            this.mStateHandler.obtainMessage(HwFullNetworkConstantsInner.EVENT_TRANS_TO_DEFAULT).sendToTarget();
        }
    }

    private void prepareBeforeSwitch(int slotId, Message response) {
        logd("setDefault4GSlot: target slot id is: " + slotId + " response:" + response);
        this.mChipOther.mNeedExchangeDb = true;
        sendHwSwitchSlotStartBroadcast();
        this.mChipCommon.mSet4GSlotCompleteMsg = response;
        this.mChipCommon.isSet4GSlotInProgress = true;
        this.mChipCommon.current4GSlotBackup = this.mChipCommon.getUserSwitchDualCardSlots();
    }

    private boolean isNeedSetRadioCapability(int expectedMainSlotId) {
        RadioCapabilityEx expectedMainSlotRC;
        PhoneExt[] mPhones = PhoneFactoryExt.getPhones();
        if (mPhones == null) {
            logd("isNeedSetRadioCapability: mPhones is null");
            return false;
        } else if (!SubscriptionManagerEx.isValidSlotIndex(expectedMainSlotId) || mPhones[expectedMainSlotId] == null || (expectedMainSlotRC = mPhones[expectedMainSlotId].getRadioCapability()) == null || MAIN_STACK.equals(expectedMainSlotRC.getLogicalModemUuid())) {
            logd("isNeedSetRadioCapability: do not need set radio capability again, now main stack is already ok");
            return false;
        } else {
            logd("isNeedSetRadioCapability: need switch LogicalModemUuid for expectedMainSlotId");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateQcomMtkBase, com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateBase
    public void setRadioCapabilityDone(Intent intent) {
        sendSetRadioCapabilitySuccess(!this.mChipCommon.isDualImsSwitchOpened());
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateQcomMtkBase, com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateBase
    public void logd(String msg) {
        RlogEx.i(LOG_TAG, msg);
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateQcomMtkBase, com.android.internal.telephony.fullnetwork.HwFullNetworkSetStateBase
    public void loge(String msg) {
        RlogEx.e(LOG_TAG, msg);
    }
}
