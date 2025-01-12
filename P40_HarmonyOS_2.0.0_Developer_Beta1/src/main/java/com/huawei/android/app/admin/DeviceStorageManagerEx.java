package com.huawei.android.app.admin;

import android.content.ComponentName;
import android.os.Bundle;
import huawei.android.app.admin.HwDevicePolicyManagerEx;
import huawei.android.os.HwLocalDevManager;

public class DeviceStorageManagerEx {
    private static final String DISABLE_SDWRITING = "disable-sdwriting";
    private static final String TAG = DeviceStorageManagerEx.class.getSimpleName();
    private final HwDevicePolicyManagerEx mDpm = new HwDevicePolicyManagerEx();

    public boolean setSDWritingDisabled(ComponentName admin, boolean isDisabled) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("value", isDisabled);
        return this.mDpm.setPolicy(admin, DISABLE_SDWRITING, bundle);
    }

    public boolean isSDWritingDisabled(ComponentName admin) {
        Bundle bundle = this.mDpm.getPolicy(admin, DISABLE_SDWRITING);
        if (bundle != null) {
            return bundle.getBoolean("value");
        }
        return false;
    }

    public static int getLocalDevStat(int dev) {
        return HwLocalDevManager.getInstance().getLocalDevStat(dev);
    }

    public static String getDeviceId(int dev) {
        return HwLocalDevManager.getInstance().getDeviceId(dev);
    }

    public static int doSdcardCheckRW() {
        return HwLocalDevManager.getInstance().doSdcardCheckRW();
    }
}
