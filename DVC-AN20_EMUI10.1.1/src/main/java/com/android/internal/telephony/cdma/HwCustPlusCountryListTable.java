package com.android.internal.telephony.cdma;

import android.telephony.Rlog;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;

public class HwCustPlusCountryListTable {
    private static final boolean DBG = true;
    private static SparseIntArray FindOutSidMap = new SparseIntArray();
    static final String LOG_TAG = "CDMA-HwCustPlusCountryListTable";
    protected static final HwCustMccIddNddSid[] MccIddNddSidMap = HwCustTelephonyPlusCode.MccIddNddSidMap_support;
    protected static final HwCustMccSidLtmOff[] MccSidLtmOffMap = HwCustTelephonyPlusCode.MccSidLtmOffMap_support;
    static final int PARAM_FOR_OFFSET = 2;
    static final Object sInstSync = new Object();
    private static final HwCustPlusCountryListTable sInstance = new HwCustPlusCountryListTable();

    public static HwCustPlusCountryListTable getInstance() {
        return sInstance;
    }

    private HwCustPlusCountryListTable() {
    }

    public static HwCustMccIddNddSid getItemFromCountryListByMcc(String sMcc) {
        Rlog.d(LOG_TAG, "plus: getItemFromCountryListByMcc mcc = " + sMcc);
        int mcc = getIntFromString(sMcc);
        HwCustMccIddNddSid[] hwCustMccIddNddSidArr = MccIddNddSidMap;
        for (HwCustMccIddNddSid item : hwCustMccIddNddSidArr) {
            if (mcc == item.Mcc) {
                Rlog.d(LOG_TAG, "plus: Now find mccIddNddSid = " + item);
                return item;
            }
        }
        Rlog.e(LOG_TAG, "plus: can't find one that match the Mcc");
        return null;
    }

    public static int getIntFromString(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Rlog.e(LOG_TAG, Log.getStackTraceString(e));
            return -1;
        }
    }

    public static ArrayList<HwCustMccSidLtmOff> getItemsFromSidConflictTableBySid(String sSid) {
        int sid = getIntFromString(sSid);
        ArrayList<HwCustMccSidLtmOff> itemList = new ArrayList<>();
        HwCustMccSidLtmOff[] hwCustMccSidLtmOffArr = MccSidLtmOffMap;
        for (HwCustMccSidLtmOff item : hwCustMccSidLtmOffArr) {
            if (sid == item.Sid) {
                itemList.add(item);
            }
        }
        return itemList;
    }

    public static String getMccFromMainTableBySid(String sSid) {
        int sid = getIntFromString(sSid);
        String mcc = null;
        HwCustMccIddNddSid[] hwCustMccIddNddSidArr = MccIddNddSidMap;
        int length = hwCustMccIddNddSidArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            HwCustMccIddNddSid item = hwCustMccIddNddSidArr[i];
            if (sid <= item.SidMax && sid >= item.SidMin) {
                mcc = Integer.toString(item.Mcc);
                break;
            }
            i++;
        }
        Rlog.d(LOG_TAG, "plus: getMccFromMainTableBySid mcc = " + mcc);
        return mcc;
    }

    public String getCcFromConflictTableByLTM(ArrayList<HwCustMccSidLtmOff> itemList, String sLtm_off) {
        Rlog.d(LOG_TAG, "plus:  getCcFromConflictTableByLTM sLtm_off = " + sLtm_off);
        if (itemList == null || itemList.size() == 0) {
            Rlog.e(LOG_TAG, "plus: [getCcFromConflictTableByLTM] please check the param ");
            return null;
        }
        String FindMcc = null;
        try {
            int ltm_off = Integer.parseInt(sLtm_off);
            Iterator<HwCustMccSidLtmOff> it = itemList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HwCustMccSidLtmOff item = it.next();
                int max = item.LtmOffMax * 2;
                int min = item.LtmOffMin * 2;
                if (ltm_off <= max && ltm_off >= min) {
                    FindMcc = Integer.toString(item.Mcc);
                    break;
                }
            }
            Rlog.d(LOG_TAG, "plus: find one that match the ltm_off mcc = " + FindMcc);
            return FindMcc;
        } catch (NumberFormatException e) {
            Log.e(LOG_TAG, Log.getStackTraceString(e));
            return null;
        }
    }
}