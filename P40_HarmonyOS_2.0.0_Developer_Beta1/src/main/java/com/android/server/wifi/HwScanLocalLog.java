package com.android.server.wifi;

import android.net.wifi.WifiScanLog;
import android.util.LocalLog;
import java.util.Arrays;
import java.util.IllegalFormatConversionException;
import java.util.Locale;

public class HwScanLocalLog {
    public static void localLog(LocalLog localLog, String scanKey, String eventKey, String log) {
        localLog(localLog, scanKey, eventKey, log, null);
    }

    public static void localLog(LocalLog localLog, String scanKey, String eventKey, String log, Object... params) {
        String fullLog;
        WifiScanLog.getDefault().addEvent(scanKey, eventKey, log, params);
        String fullLog2 = scanKey + eventKey + " ";
        try {
            fullLog = fullLog2 + String.format(Locale.ENGLISH, log, params);
        } catch (IllegalFormatConversionException e) {
            fullLog = fullLog2 + log;
            if (params != null) {
                fullLog = fullLog + Arrays.toString(params);
            }
        }
        localLog.log(fullLog);
    }
}
