package vendor.huawei.hardware.hisiradio.V1_3;

import android.bluetooth.BluetoothHidDevice;
import android.internal.hidl.base.V1_0.DebugInfo;
import android.internal.hidl.base.V1_0.IBase;
import android.os.HidlSupport;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwInterface;
import android.os.NativeHandle;
import android.os.RemoteException;
import com.android.internal.midi.MidiConstants;
import com.android.internal.telephony.PhoneConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import vendor.huawei.hardware.hisiradio.V1_0.CellInfo;
import vendor.huawei.hardware.hisiradio.V1_0.CsgNetworkInfo;
import vendor.huawei.hardware.hisiradio.V1_0.CsgNetworkInfo_1_1;
import vendor.huawei.hardware.hisiradio.V1_0.HwCall_V1_2;
import vendor.huawei.hardware.hisiradio.V1_0.RILDeviceVersionResponse;
import vendor.huawei.hardware.hisiradio.V1_0.RILDsFlowInfoResponse;
import vendor.huawei.hardware.hisiradio.V1_0.RILRADIOSYSINFO;
import vendor.huawei.hardware.hisiradio.V1_0.RILUICCAUTHRESPONSE;
import vendor.huawei.hardware.hisiradio.V1_0.RadioResponseInfo;
import vendor.huawei.hardware.hisiradio.V1_0.RspMsgPayload;
import vendor.huawei.hardware.hisiradio.V1_0.SetupDataCallResult;
import vendor.huawei.hardware.hisiradio.V1_1.HwDataRegStateResult_1_1;
import vendor.huawei.hardware.hisiradio.V1_1.HwSignalStrength_1_1;
import vendor.huawei.hardware.hisiradio.V1_1.HwVoiceRegStateResult_1_1;
import vendor.huawei.hardware.hisiradio.V1_1.LteAttachInfo;
import vendor.huawei.hardware.hisiradio.V1_2.HwCellInfo_1_2;
import vendor.huawei.hardware.hisiradio.V1_2.HwDataRegStateResult13;
import vendor.huawei.hardware.hisiradio.V1_2.HwDataRegStateResult_1_2;
import vendor.huawei.hardware.hisiradio.V1_2.HwVoiceRegStateResult_1_2;

public interface IHisiRadioResponse extends vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse {
    public static final String kInterfaceName = "vendor.huawei.hardware.hisiradio@1.3::IHisiRadioResponse";

    @Override // android.os.IHwInterface, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    IHwBinder asBinder();

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    void debug(NativeHandle nativeHandle, ArrayList<String> arrayList) throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    DebugInfo getDebugInfo() throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    ArrayList<byte[]> getHashChain() throws RemoteException;

    void getHwNrSaStateResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getHwNrSsbInfoResponse(RadioResponseInfo radioResponseInfo, NrCellSsbIds nrCellSsbIds) throws RemoteException;

    void getHwRrcConnectionStateResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    ArrayList<String> interfaceChain() throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    String interfaceDescriptor() throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    boolean linkToDeath(IHwBinder.DeathRecipient deathRecipient, long j) throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    void notifySyspropsChanged() throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    void ping() throws RemoteException;

    void processSmsAntiAttackResponse(RadioResponseInfo radioResponseInfo, ArrayList<Integer> arrayList) throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    void setHALInstrumentation() throws RemoteException;

    void setHwNrSaStateResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setVonrSwitchResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
    boolean unlinkToDeath(IHwBinder.DeathRecipient deathRecipient) throws RemoteException;

    static default IHisiRadioResponse asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        IHwInterface iface = binder.queryLocalInterface(kInterfaceName);
        if (iface != null && (iface instanceof IHisiRadioResponse)) {
            return (IHisiRadioResponse) iface;
        }
        IHisiRadioResponse proxy = new Proxy(binder);
        try {
            Iterator<String> it = proxy.interfaceChain().iterator();
            while (it.hasNext()) {
                if (it.next().equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static default IHisiRadioResponse castFrom(IHwInterface iface) {
        if (iface == null) {
            return null;
        }
        return asInterface(iface.asBinder());
    }

    static default IHisiRadioResponse getService(String serviceName, boolean retry) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName, retry));
    }

    static default IHisiRadioResponse getService(boolean retry) throws RemoteException {
        return getService(PhoneConstants.APN_TYPE_DEFAULT, retry);
    }

    static default IHisiRadioResponse getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    static default IHisiRadioResponse getService() throws RemoteException {
        return getService(PhoneConstants.APN_TYPE_DEFAULT);
    }

    public static final class Proxy implements IHisiRadioResponse {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            this.mRemote = (IHwBinder) Objects.requireNonNull(remote);
        }

        @Override // android.os.IHwInterface, vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                return interfaceDescriptor() + "@Proxy";
            } catch (RemoteException e) {
                return "[class or subclass of vendor.huawei.hardware.hisiradio@1.3::IHisiRadioResponse]@Proxy";
            }
        }

        public final boolean equals(Object other) {
            return HidlSupport.interfacesEqual(this, other);
        }

        public final int hashCode() {
            return asBinder().hashCode();
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void RspMsg(RadioResponseInfo info, int msgId, RspMsgPayload payload) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(msgId);
            payload.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getDeviceVersionResponse(RadioResponseInfo info, RILDeviceVersionResponse deviceVersion) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            deviceVersion.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getDsFlowInfoResponse(RadioResponseInfo info, RILDsFlowInfoResponse dsFlowInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dsFlowInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getSystemInfoExResponse(RadioResponseInfo info, RILRADIOSYSINFO sysInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sysInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getAvailableCsgIdsResponse(RadioResponseInfo info, ArrayList<CsgNetworkInfo> csgInfos) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CsgNetworkInfo.writeVectorToParcel(_hidl_request, csgInfos);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void manualSelectionCsgIdResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void setupDataCallEmergencyResponse(RadioResponseInfo info, SetupDataCallResult dcResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dcResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(7, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void deactivateDataCallEmergencyResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(8, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getCellInfoListOtdoaResponse(RadioResponseInfo info, ArrayList<CellInfo> cellInfoList) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CellInfo.writeVectorToParcel(_hidl_request, cellInfoList);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(9, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getAvailableCsgIdsResponse_1_1(RadioResponseInfo info, ArrayList<CsgNetworkInfo_1_1> csgInfos) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CsgNetworkInfo_1_1.writeVectorToParcel(_hidl_request, csgInfos);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(10, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getCurrentCallsResponseHwV1_2(RadioResponseInfo info, ArrayList<HwCall_V1_2> calls) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwCall_V1_2.writeVectorToParcel(_hidl_request, calls);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(11, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void uiccAuthResponse(RadioResponseInfo info, RILUICCAUTHRESPONSE uiccAuthRst) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            uiccAuthRst.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(12, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void sendSimChgTypeInfoResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(13, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getCardTrayInfoResponse(RadioResponseInfo info, ArrayList<Byte> cardTrayInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt8Vector(cardTrayInfo);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(14, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getNvcfgMatchedResultResponse(RadioResponseInfo info, String nvcfgName) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(nvcfgName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(15, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void getCapOfRecPseBaseStationResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(16, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void getLteAttachInfoResponse(RadioResponseInfo info, LteAttachInfo attachInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            attachInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(17, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void setUlfreqEnableResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(18, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void getHwSignalStrengthResponse_1_1(RadioResponseInfo info, HwSignalStrength_1_1 sigStrength) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sigStrength.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(19, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void getHwPreferredNetworkTypeResponse_1_1(RadioResponseInfo info, int nwType) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(nwType);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(20, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void getVoiceRegistrationStateResponse_1_1(RadioResponseInfo info, HwVoiceRegStateResult_1_1 voiceRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            voiceRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(21, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void getDataRegistrationStateResponse_1_1(RadioResponseInfo info, HwDataRegStateResult_1_1 dataRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dataRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(22, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse
        public void setTemperatureControlResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(23, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getImsDomainResponseV1_1(RadioResponseInfo info, int imsDomain) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(imsDomain);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(24, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getHwCellInfoListResponse_1_2(RadioResponseInfo info, ArrayList<HwCellInfo_1_2> cellInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwCellInfo_1_2.writeVectorToParcel(_hidl_request, cellInfo);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(25, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getHwDataRegistrationStateResponse13(RadioResponseInfo info, HwDataRegStateResult13 dataRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dataRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(26, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getHwVoiceRegistrationStateResponse_1_2(RadioResponseInfo info, HwVoiceRegStateResult_1_2 voiceRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            voiceRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(27, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getHwDataRegistrationStateResponse_1_2(RadioResponseInfo info, HwDataRegStateResult_1_2 dataRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dataRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(28, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void setHwNrOptionModeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(29, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void getHwNrOptionModeResponse(RadioResponseInfo info, int mode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(mode);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(30, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void sendMutiChipSessionConfigResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(31, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse
        public void sendVsimDataToModemResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(32, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void setHwNrSaStateResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(33, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void getHwNrSaStateResponse(RadioResponseInfo info, int on) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(on);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(34, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void getHwNrSsbInfoResponse(RadioResponseInfo info, NrCellSsbIds ssbIds) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            ssbIds.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(35, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void processSmsAntiAttackResponse(RadioResponseInfo info, ArrayList<Integer> response) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32Vector(response);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(36, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void getHwRrcConnectionStateResponse(RadioResponseInfo info, int state) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(state);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(37, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse
        public void setVonrSwitchResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IHisiRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(38, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readStringVector();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void debug(NativeHandle fd, ArrayList<String> options) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            _hidl_request.writeNativeHandle(fd);
            _hidl_request.writeStringVector(options);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256131655, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readString();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<byte[]> _hidl_out_hashchain = new ArrayList<>();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16);
                int _hidl_vec_size = _hidl_blob.getInt32(8);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
                _hidl_out_hashchain.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                    byte[] _hidl_vec_element = new byte[32];
                    childBlob.copyToInt8Array((long) (_hidl_index_0 * 32), _hidl_vec_element, 32);
                    _hidl_out_hashchain.add(_hidl_vec_element);
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public boolean linkToDeath(IHwBinder.DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public boolean unlinkToDeath(IHwBinder.DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends HwBinder implements IHisiRadioResponse {
        @Override // android.os.IHwInterface, vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public IHwBinder asBinder() {
            return this;
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final ArrayList<String> interfaceChain() {
            return new ArrayList<>(Arrays.asList(IHisiRadioResponse.kInterfaceName, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName, IBase.kInterfaceName));
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public void debug(NativeHandle fd, ArrayList<String> arrayList) {
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final String interfaceDescriptor() {
            return IHisiRadioResponse.kInterfaceName;
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList<>(Arrays.asList(new byte[]{-38, 4, 56, -23, 78, 96, 113, -12, MidiConstants.STATUS_CHANNEL_PRESSURE, -36, 117, -19, 95, 68, -83, -69, 67, -102, MidiConstants.STATUS_SONG_POSITION, 18, -53, -51, 111, -94, -69, -57, -87, -84, 102, MidiConstants.STATUS_CHANNEL_MASK, 39, -75}, new byte[]{-79, 38, 89, -20, -97, 32, -59, -122, -65, 12, -89, -127, 79, 95, 107, -123, -9, 73, -90, 99, -71, -83, 48, -100, -115, -59, 83, 79, 54, 82, 119, -21}, new byte[]{-103, 53, -123, -68, 23, 8, MidiConstants.STATUS_CHANNEL_PRESSURE, -30, -94, 109, -1, -16, 45, 52, MidiConstants.STATUS_SONG_SELECT, -23, 58, 7, 125, -50, -33, -82, 28, 46, 17, 62, 58, -34, -72, -59, -57, -43}, new byte[]{-122, 123, 86, 36, 62, -65, -40, -110, -87, -72, 55, -43, -115, -95, 26, 66, 116, -121, -84, -98, 94, 67, MidiConstants.STATUS_MIDI_TIME_CODE, -84, BluetoothHidDevice.ERROR_RSP_UNKNOWN, 125, 99, 6, 7, 10, -64, -118}, new byte[]{-20, Byte.MAX_VALUE, -41, -98, MidiConstants.STATUS_CHANNEL_PRESSURE, 45, -6, -123, -68, 73, -108, 38, -83, -82, 62, -66, 35, -17, 5, 36, MidiConstants.STATUS_SONG_SELECT, -51, 105, 87, 19, -109, 36, -72, 59, 24, -54, 76}));
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final void setHALInstrumentation() {
        }

        @Override // android.os.IHwBinder, vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final boolean linkToDeath(IHwBinder.DeathRecipient recipient, long cookie) {
            return true;
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final void ping() {
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = HidlSupport.getPidIfSharable();
            info.ptr = 0;
            info.arch = 0;
            return info;
        }

        @Override // vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final void notifySyspropsChanged() {
            HwBinder.enableInstrumentation();
        }

        @Override // android.os.IHwBinder, vendor.huawei.hardware.hisiradio.V1_3.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse, android.internal.hidl.base.V1_0.IBase, vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse, vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse
        public final boolean unlinkToDeath(IHwBinder.DeathRecipient recipient) {
            return true;
        }

        @Override // android.os.IHwBinder
        public IHwInterface queryLocalInterface(String descriptor) {
            if (IHisiRadioResponse.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            return interfaceDescriptor() + "@Stub";
        }

        @Override // android.os.HwBinder
        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            boolean _hidl_is_oneway = false;
            boolean _hidl_is_oneway2 = true;
            switch (_hidl_code) {
                case 1:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info = new RadioResponseInfo();
                    info.readFromParcel(_hidl_request);
                    int msgId = _hidl_request.readInt32();
                    RspMsgPayload payload = new RspMsgPayload();
                    payload.readFromParcel(_hidl_request);
                    RspMsg(info, msgId, payload);
                    return;
                case 2:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info2 = new RadioResponseInfo();
                    info2.readFromParcel(_hidl_request);
                    RILDeviceVersionResponse deviceVersion = new RILDeviceVersionResponse();
                    deviceVersion.readFromParcel(_hidl_request);
                    getDeviceVersionResponse(info2, deviceVersion);
                    return;
                case 3:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info3 = new RadioResponseInfo();
                    info3.readFromParcel(_hidl_request);
                    RILDsFlowInfoResponse dsFlowInfo = new RILDsFlowInfoResponse();
                    dsFlowInfo.readFromParcel(_hidl_request);
                    getDsFlowInfoResponse(info3, dsFlowInfo);
                    return;
                case 4:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info4 = new RadioResponseInfo();
                    info4.readFromParcel(_hidl_request);
                    RILRADIOSYSINFO sysInfo = new RILRADIOSYSINFO();
                    sysInfo.readFromParcel(_hidl_request);
                    getSystemInfoExResponse(info4, sysInfo);
                    return;
                case 5:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info5 = new RadioResponseInfo();
                    info5.readFromParcel(_hidl_request);
                    getAvailableCsgIdsResponse(info5, CsgNetworkInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 6:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info6 = new RadioResponseInfo();
                    info6.readFromParcel(_hidl_request);
                    manualSelectionCsgIdResponse(info6);
                    return;
                case 7:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info7 = new RadioResponseInfo();
                    info7.readFromParcel(_hidl_request);
                    SetupDataCallResult dcResponse = new SetupDataCallResult();
                    dcResponse.readFromParcel(_hidl_request);
                    setupDataCallEmergencyResponse(info7, dcResponse);
                    return;
                case 8:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info8 = new RadioResponseInfo();
                    info8.readFromParcel(_hidl_request);
                    deactivateDataCallEmergencyResponse(info8);
                    return;
                case 9:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info9 = new RadioResponseInfo();
                    info9.readFromParcel(_hidl_request);
                    getCellInfoListOtdoaResponse(info9, CellInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 10:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info10 = new RadioResponseInfo();
                    info10.readFromParcel(_hidl_request);
                    getAvailableCsgIdsResponse_1_1(info10, CsgNetworkInfo_1_1.readVectorFromParcel(_hidl_request));
                    return;
                case 11:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info11 = new RadioResponseInfo();
                    info11.readFromParcel(_hidl_request);
                    getCurrentCallsResponseHwV1_2(info11, HwCall_V1_2.readVectorFromParcel(_hidl_request));
                    return;
                case 12:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info12 = new RadioResponseInfo();
                    info12.readFromParcel(_hidl_request);
                    RILUICCAUTHRESPONSE uiccAuthRst = new RILUICCAUTHRESPONSE();
                    uiccAuthRst.readFromParcel(_hidl_request);
                    uiccAuthResponse(info12, uiccAuthRst);
                    return;
                case 13:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info13 = new RadioResponseInfo();
                    info13.readFromParcel(_hidl_request);
                    sendSimChgTypeInfoResponse(info13);
                    return;
                case 14:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info14 = new RadioResponseInfo();
                    info14.readFromParcel(_hidl_request);
                    getCardTrayInfoResponse(info14, _hidl_request.readInt8Vector());
                    return;
                case 15:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info15 = new RadioResponseInfo();
                    info15.readFromParcel(_hidl_request);
                    getNvcfgMatchedResultResponse(info15, _hidl_request.readString());
                    return;
                case 16:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_0.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info16 = new RadioResponseInfo();
                    info16.readFromParcel(_hidl_request);
                    getCapOfRecPseBaseStationResponse(info16);
                    return;
                case 17:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info17 = new RadioResponseInfo();
                    info17.readFromParcel(_hidl_request);
                    LteAttachInfo attachInfo = new LteAttachInfo();
                    attachInfo.readFromParcel(_hidl_request);
                    getLteAttachInfoResponse(info17, attachInfo);
                    return;
                case 18:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info18 = new RadioResponseInfo();
                    info18.readFromParcel(_hidl_request);
                    setUlfreqEnableResponse(info18);
                    return;
                case 19:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info19 = new RadioResponseInfo();
                    info19.readFromParcel(_hidl_request);
                    HwSignalStrength_1_1 sigStrength = new HwSignalStrength_1_1();
                    sigStrength.readFromParcel(_hidl_request);
                    getHwSignalStrengthResponse_1_1(info19, sigStrength);
                    return;
                case 20:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info20 = new RadioResponseInfo();
                    info20.readFromParcel(_hidl_request);
                    getHwPreferredNetworkTypeResponse_1_1(info20, _hidl_request.readInt32());
                    return;
                case 21:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info21 = new RadioResponseInfo();
                    info21.readFromParcel(_hidl_request);
                    HwVoiceRegStateResult_1_1 voiceRegResponse = new HwVoiceRegStateResult_1_1();
                    voiceRegResponse.readFromParcel(_hidl_request);
                    getVoiceRegistrationStateResponse_1_1(info21, voiceRegResponse);
                    return;
                case 22:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info22 = new RadioResponseInfo();
                    info22.readFromParcel(_hidl_request);
                    HwDataRegStateResult_1_1 dataRegResponse = new HwDataRegStateResult_1_1();
                    dataRegResponse.readFromParcel(_hidl_request);
                    getDataRegistrationStateResponse_1_1(info22, dataRegResponse);
                    return;
                case 23:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_1.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info23 = new RadioResponseInfo();
                    info23.readFromParcel(_hidl_request);
                    setTemperatureControlResponse(info23);
                    return;
                case 24:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info24 = new RadioResponseInfo();
                    info24.readFromParcel(_hidl_request);
                    getImsDomainResponseV1_1(info24, _hidl_request.readInt32());
                    return;
                case 25:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info25 = new RadioResponseInfo();
                    info25.readFromParcel(_hidl_request);
                    getHwCellInfoListResponse_1_2(info25, HwCellInfo_1_2.readVectorFromParcel(_hidl_request));
                    return;
                case 26:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info26 = new RadioResponseInfo();
                    info26.readFromParcel(_hidl_request);
                    HwDataRegStateResult13 dataRegResponse2 = new HwDataRegStateResult13();
                    dataRegResponse2.readFromParcel(_hidl_request);
                    getHwDataRegistrationStateResponse13(info26, dataRegResponse2);
                    return;
                case 27:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info27 = new RadioResponseInfo();
                    info27.readFromParcel(_hidl_request);
                    HwVoiceRegStateResult_1_2 voiceRegResponse2 = new HwVoiceRegStateResult_1_2();
                    voiceRegResponse2.readFromParcel(_hidl_request);
                    getHwVoiceRegistrationStateResponse_1_2(info27, voiceRegResponse2);
                    return;
                case 28:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info28 = new RadioResponseInfo();
                    info28.readFromParcel(_hidl_request);
                    HwDataRegStateResult_1_2 dataRegResponse3 = new HwDataRegStateResult_1_2();
                    dataRegResponse3.readFromParcel(_hidl_request);
                    getHwDataRegistrationStateResponse_1_2(info28, dataRegResponse3);
                    return;
                case 29:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info29 = new RadioResponseInfo();
                    info29.readFromParcel(_hidl_request);
                    setHwNrOptionModeResponse(info29);
                    return;
                case 30:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info30 = new RadioResponseInfo();
                    info30.readFromParcel(_hidl_request);
                    getHwNrOptionModeResponse(info30, _hidl_request.readInt32());
                    return;
                case 31:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info31 = new RadioResponseInfo();
                    info31.readFromParcel(_hidl_request);
                    sendMutiChipSessionConfigResponse(info31);
                    return;
                case 32:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(vendor.huawei.hardware.hisiradio.V1_2.IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info32 = new RadioResponseInfo();
                    info32.readFromParcel(_hidl_request);
                    sendVsimDataToModemResponse(info32);
                    return;
                case 33:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info33 = new RadioResponseInfo();
                    info33.readFromParcel(_hidl_request);
                    setHwNrSaStateResponse(info33);
                    return;
                case 34:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info34 = new RadioResponseInfo();
                    info34.readFromParcel(_hidl_request);
                    getHwNrSaStateResponse(info34, _hidl_request.readInt32());
                    return;
                case 35:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info35 = new RadioResponseInfo();
                    info35.readFromParcel(_hidl_request);
                    NrCellSsbIds ssbIds = new NrCellSsbIds();
                    ssbIds.readFromParcel(_hidl_request);
                    getHwNrSsbInfoResponse(info35, ssbIds);
                    return;
                case 36:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info36 = new RadioResponseInfo();
                    info36.readFromParcel(_hidl_request);
                    processSmsAntiAttackResponse(info36, _hidl_request.readInt32Vector());
                    return;
                case 37:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info37 = new RadioResponseInfo();
                    info37.readFromParcel(_hidl_request);
                    getHwRrcConnectionStateResponse(info37, _hidl_request.readInt32());
                    return;
                case 38:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_is_oneway = true;
                    }
                    if (!_hidl_is_oneway) {
                        _hidl_reply.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    _hidl_request.enforceInterface(IHisiRadioResponse.kInterfaceName);
                    RadioResponseInfo info38 = new RadioResponseInfo();
                    info38.readFromParcel(_hidl_request);
                    setVonrSwitchResponse(info38);
                    return;
                default:
                    switch (_hidl_code) {
                        case 256067662:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            ArrayList<String> _hidl_out_descriptors = interfaceChain();
                            _hidl_reply.writeStatus(0);
                            _hidl_reply.writeStringVector(_hidl_out_descriptors);
                            _hidl_reply.send();
                            return;
                        case 256131655:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            debug(_hidl_request.readNativeHandle(), _hidl_request.readStringVector());
                            _hidl_reply.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 256136003:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            String _hidl_out_descriptor = interfaceDescriptor();
                            _hidl_reply.writeStatus(0);
                            _hidl_reply.writeString(_hidl_out_descriptor);
                            _hidl_reply.send();
                            return;
                        case 256398152:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                            _hidl_reply.writeStatus(0);
                            HwBlob _hidl_blob = new HwBlob(16);
                            int _hidl_vec_size = _hidl_out_hashchain.size();
                            _hidl_blob.putInt32(8, _hidl_vec_size);
                            _hidl_blob.putBool(12, false);
                            HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
                            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                                long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                                byte[] _hidl_array_item_1 = _hidl_out_hashchain.get(_hidl_index_0);
                                if (_hidl_array_item_1 == null || _hidl_array_item_1.length != 32) {
                                    throw new IllegalArgumentException("Array element is not of the expected length");
                                }
                                childBlob.putInt8Array(_hidl_array_offset_1, _hidl_array_item_1);
                            }
                            _hidl_blob.putBlob(0, childBlob);
                            _hidl_reply.writeBuffer(_hidl_blob);
                            _hidl_reply.send();
                            return;
                        case 256462420:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_is_oneway = true;
                            }
                            if (!_hidl_is_oneway) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            setHALInstrumentation();
                            return;
                        case 256660548:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_is_oneway = true;
                            }
                            if (_hidl_is_oneway) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        case 256921159:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            ping();
                            _hidl_reply.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 257049926:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway2 = false;
                            }
                            if (_hidl_is_oneway2) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            DebugInfo _hidl_out_info = getDebugInfo();
                            _hidl_reply.writeStatus(0);
                            _hidl_out_info.writeToParcel(_hidl_reply);
                            _hidl_reply.send();
                            return;
                        case 257120595:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_is_oneway = true;
                            }
                            if (!_hidl_is_oneway) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            _hidl_request.enforceInterface(IBase.kInterfaceName);
                            notifySyspropsChanged();
                            return;
                        case 257250372:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_is_oneway = true;
                            }
                            if (_hidl_is_oneway) {
                                _hidl_reply.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }
}
