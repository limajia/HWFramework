package ohos.utils.adapter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import ohos.utils.IntentConstants;

public final class IntentConstantMapper {
    private static final Map<String, String> ACTION_A2Z_MAP = Collections.unmodifiableMap(new HashMap<String, String>() {
        /* class ohos.utils.adapter.IntentConstantMapper.AnonymousClass2 */

        {
            put("android.intent.action.MAIN", IntentConstants.ACTION_HOME);
            put("android.intent.action.DIAL", IntentConstants.ACTION_DIAL);
            put("android.intent.action.SEARCH", IntentConstants.ACTION_SEARCH);
            put("android.settings.WIRELESS_SETTINGS", IntentConstants.ACTION_WIRELESS_SETTINGS);
            put("android.settings.MANAGE_APPLICATIONS_SETTINGS", IntentConstants.ACTION_MANAGE_APPLICATIONS_SETTINGS);
            put("android.settings.APPLICATION_DETAILS_SETTINGS", IntentConstants.ACTION_APPLICATION_DETAILS_SETTINGS);
            put("android.intent.action.SET_ALARM", IntentConstants.ACTION_SET_ALARM);
            put("android.intent.action.SHOW_ALARMS", IntentConstants.ACTION_SHOW_ALARMS);
            put("android.intent.action.SNOOZE_ALARM", IntentConstants.ACTION_SNOOZE_ALARM);
            put("android.intent.action.DISMISS_ALARM", IntentConstants.ACTION_DISMISS_ALARM);
            put("android.intent.action.DISMISS_TIMER", IntentConstants.ACTION_DISMISS_TIMER);
        }
    });
    private static final Map<String, String> ACTION_MAP = Collections.unmodifiableMap(new HashMap<String, String>() {
        /* class ohos.utils.adapter.IntentConstantMapper.AnonymousClass1 */

        {
            put(IntentConstants.ACTION_HOME, "android.intent.action.MAIN");
            put(IntentConstants.ACTION_DIAL, "android.intent.action.DIAL");
            put(IntentConstants.ACTION_SEARCH, "android.intent.action.SEARCH");
            put(IntentConstants.ACTION_WIRELESS_SETTINGS, "android.settings.WIRELESS_SETTINGS");
            put(IntentConstants.ACTION_MANAGE_APPLICATIONS_SETTINGS, "android.settings.MANAGE_APPLICATIONS_SETTINGS");
            put(IntentConstants.ACTION_APPLICATION_DETAILS_SETTINGS, "android.settings.APPLICATION_DETAILS_SETTINGS");
            put(IntentConstants.ACTION_SET_ALARM, "android.intent.action.SET_ALARM");
            put(IntentConstants.ACTION_SHOW_ALARMS, "android.intent.action.SHOW_ALARMS");
            put(IntentConstants.ACTION_SNOOZE_ALARM, "android.intent.action.SNOOZE_ALARM");
            put(IntentConstants.ACTION_DISMISS_ALARM, "android.intent.action.DISMISS_ALARM");
            put(IntentConstants.ACTION_DISMISS_TIMER, "android.intent.action.DISMISS_TIMER");
        }
    });
    private static final Map<String, String> ENTITY_MAP = Collections.unmodifiableMap(new HashMap<String, String>() {
        /* class ohos.utils.adapter.IntentConstantMapper.AnonymousClass3 */

        {
            put(IntentConstants.ENTITY_DEFAULT, "android.intent.category.DEFAULT");
            put(IntentConstants.ENTITY_HOME, "android.intent.category.LAUNCHER");
            put(IntentConstants.ENTITY_VOICE, "android.intent.category.VOICE");
        }
    });

    public static Optional<String> convertToAndroidAction(String str) {
        return Optional.ofNullable(ACTION_MAP.get(str));
    }

    public static Optional<String> convertToAndroidEntity(String str) {
        return Optional.ofNullable(ENTITY_MAP.get(str));
    }

    public static Optional<String> convertToZidaneAction(String str) {
        return Optional.ofNullable(ACTION_A2Z_MAP.get(str));
    }

    public static Optional<String> convertToZidaneEntity(String str) {
        for (Map.Entry<String, String> entry : ENTITY_MAP.entrySet()) {
            if (entry.getValue().equals(str)) {
                return Optional.ofNullable(entry.getKey());
            }
        }
        return Optional.empty();
    }

    private IntentConstantMapper() {
    }
}
