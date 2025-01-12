package com.huawei.security.keymaster;

import java.util.HashMap;
import java.util.Map;

public final class HwKeymasterDefs {
    public static final Map<Integer, String> ERROR_CODE_TO_STRING = new HashMap(40);
    public static final int HW_AUTH_FACE = 4;
    public static final int HW_AUTH_FINGERPRINT = 2;
    public static final int HW_AUTH_PASSWORD = 1;
    public static final int KM_ALGORITHM_AES = 32;
    public static final int KM_ALGORITHM_DIGEST = 127;
    public static final int KM_ALGORITHM_EC = 3;
    public static final int KM_ALGORITHM_ED25519 = 4;
    public static final int KM_ALGORITHM_HMAC = 128;
    public static final int KM_ALGORITHM_RSA = 1;
    public static final int KM_ALGORITHM_X25519 = 5;
    public static final int KM_BIGNUM = Integer.MIN_VALUE;
    public static final int KM_BLOB_REQUIRES_FILE_SYSTEM = 1;
    public static final int KM_BLOB_STANDALONE = 0;
    public static final int KM_BOOL = 1879048192;
    public static final int KM_BYTES = -1879048192;
    public static final int KM_DATE = 1610612736;
    public static final int KM_DIGEST_MD5 = 1;
    public static final int KM_DIGEST_NONE = 0;
    public static final int KM_DIGEST_SHA1 = 2;
    public static final int KM_DIGEST_SHA_2_224 = 3;
    public static final int KM_DIGEST_SHA_2_256 = 4;
    public static final int KM_DIGEST_SHA_2_384 = 5;
    public static final int KM_DIGEST_SHA_2_512 = 6;
    public static final int KM_DIGEST_SM3_256 = 7;
    public static final int KM_ENUM = 268435456;
    public static final int KM_ENUM_REP = 536870912;
    public static final int KM_ERROR_CALLER_NONCE_PROHIBITED = -55;
    public static final int KM_ERROR_CONCURRENT_ACCESS_CONFLICT = -47;
    public static final int KM_ERROR_DELEGATION_NOT_ALLOWED = -23;
    public static final int KM_ERROR_IMPORTED_KEY_DECRYPTION_FAILED = -35;
    public static final int KM_ERROR_IMPORTED_KEY_NOT_ENCRYPTED = -34;
    public static final int KM_ERROR_IMPORTED_KEY_NOT_SIGNED = -36;
    public static final int KM_ERROR_IMPORTED_KEY_VERIFICATION_FAILED = -37;
    public static final int KM_ERROR_IMPORT_PARAMETER_MISMATCH = -44;
    public static final int KM_ERROR_INCOMPATIBLE_ALGORITHM = -5;
    public static final int KM_ERROR_INCOMPATIBLE_BLOCK_MODE = -8;
    public static final int KM_ERROR_INCOMPATIBLE_DIGEST = -13;
    public static final int KM_ERROR_INCOMPATIBLE_KEY_FORMAT = -18;
    public static final int KM_ERROR_INCOMPATIBLE_PADDING_MODE = -11;
    public static final int KM_ERROR_INCOMPATIBLE_PURPOSE = -3;
    public static final int KM_ERROR_INSUFFICIENT_BUFFER_SPACE = -29;
    public static final int KM_ERROR_INVALID_ARGUMENT = -38;
    public static final int KM_ERROR_INVALID_AUTHORIZATION_TIMEOUT = -16;
    public static final int KM_ERROR_INVALID_EXPIRATION_TIME = -14;
    public static final int KM_ERROR_INVALID_INPUT_LENGTH = -21;
    public static final int KM_ERROR_INVALID_KEY_BLOB = -33;
    public static final int KM_ERROR_INVALID_MAC_LENGTH = -57;
    public static final int KM_ERROR_INVALID_NONCE = -52;
    public static final int KM_ERROR_INVALID_OPERATION_HANDLE = -28;
    public static final int KM_ERROR_INVALID_RESCOPING = -42;
    public static final int KM_ERROR_INVALID_TAG = -40;
    public static final int KM_ERROR_INVALID_USER_ID = -15;
    public static final int KM_ERROR_KEY_EXPIRED = -25;
    public static final int KM_ERROR_KEY_EXPORT_OPTIONS_INVALID = -22;
    public static final int KM_ERROR_KEY_MAX_OPS_EXCEEDED = -56;
    public static final int KM_ERROR_KEY_NOT_YET_VALID = -24;
    public static final int KM_ERROR_KEY_RATE_LIMIT_EXCEEDED = -54;
    public static final int KM_ERROR_KEY_USER_NOT_AUTHENTICATED = -26;
    public static final int KM_ERROR_MEMORY_ALLOCATION_FAILED = -41;
    public static final int KM_ERROR_MISSING_MAC_LENGTH = -53;
    public static final int KM_ERROR_MISSING_MIN_MAC_LENGTH = -58;
    public static final int KM_ERROR_MISSING_NONCE = -51;
    public static final int KM_ERROR_OK = 0;
    public static final int KM_ERROR_OPERATION_CANCELLED = -46;
    public static final int KM_ERROR_OUTPUT_PARAMETER_NULL = -27;
    public static final int KM_ERROR_ROOT_OF_TRUST_ALREADY_SET = -1;
    public static final int KM_ERROR_SECURE_HW_ACCESS_DENIED = -45;
    public static final int KM_ERROR_SECURE_HW_BUSY = -48;
    public static final int KM_ERROR_SECURE_HW_COMMUNICATION_FAILED = -49;
    public static final int KM_ERROR_TOO_MANY_OPERATIONS = -31;
    public static final int KM_ERROR_UNEXPECTED_NULL_POINTER = -32;
    public static final int KM_ERROR_UNIMPLEMENTED = -100;
    public static final int KM_ERROR_UNKNOWN_ERROR = -1000;
    public static final int KM_ERROR_UNSUPPORTED_ALGORITHM = -4;
    public static final int KM_ERROR_UNSUPPORTED_BLOCK_MODE = -7;
    public static final int KM_ERROR_UNSUPPORTED_DIGEST = -12;
    public static final int KM_ERROR_UNSUPPORTED_EC_FIELD = -50;
    public static final int KM_ERROR_UNSUPPORTED_KEY_ENCRYPTION_ALGORITHM = -19;
    public static final int KM_ERROR_UNSUPPORTED_KEY_FORMAT = -17;
    public static final int KM_ERROR_UNSUPPORTED_KEY_SIZE = -6;
    public static final int KM_ERROR_UNSUPPORTED_KEY_VERIFICATION_ALGORITHM = -20;
    public static final int KM_ERROR_UNSUPPORTED_MAC_LENGTH = -9;
    public static final int KM_ERROR_UNSUPPORTED_MIN_MAC_LENGTH = -59;
    public static final int KM_ERROR_UNSUPPORTED_PADDING_MODE = -10;
    public static final int KM_ERROR_UNSUPPORTED_PURPOSE = -2;
    public static final int KM_ERROR_UNSUPPORTED_TAG = -39;
    public static final int KM_ERROR_VERIFICATION_FAILED = -30;
    public static final int KM_ERROR_VERSION_MISMATCH = -101;
    public static final int KM_INVALID = 0;
    public static final int KM_KEY_FORMAT_PKCS8 = 1;
    public static final int KM_KEY_FORMAT_RAW = 3;
    public static final int KM_KEY_FORMAT_SOTER_JSON = 1000;
    public static final int KM_KEY_FORMAT_X509 = 0;
    public static final int KM_MODE_CBC = 2;
    public static final int KM_MODE_CCM = 31;
    public static final int KM_MODE_CTR = 3;
    public static final int KM_MODE_ECB = 1;
    public static final int KM_MODE_GCM = 32;
    public static final int KM_ORIGIN_GENERATED = 0;
    public static final int KM_ORIGIN_IMPORTED = 2;
    public static final int KM_ORIGIN_UNKNOWN = 3;
    public static final int KM_PAD_NONE = 1;
    public static final int KM_PAD_PKCS7 = 64;
    public static final int KM_PAD_RSA_OAEP = 2;
    public static final int KM_PAD_RSA_PKCS1_1_5_ENCRYPT = 4;
    public static final int KM_PAD_RSA_PKCS1_1_5_SIGN = 5;
    public static final int KM_PAD_RSA_PSS = 3;
    public static final int KM_PURPOSE_DECRYPT = 1;
    public static final int KM_PURPOSE_ENCRYPT = 0;
    public static final int KM_PURPOSE_SIGN = 2;
    public static final int KM_PURPOSE_SOTER_ATTEST_KEY = -16711679;
    public static final int KM_PURPOSE_VERIFY = 3;
    public static final int KM_TAG_ACTIVE_DATETIME = 1610613136;
    public static final int KM_TAG_ADDITIONAL_PROTECTION_ALLOWED = 1879147493;
    public static final int KM_TAG_ADD_BIND_TEMPLATE = 1879147495;
    public static final int KM_TAG_ADD_USER_AUTH_TYPE = 805405670;
    public static final int KM_TAG_ALGORITHM = 268435458;
    public static final int KM_TAG_ALLOW_ACCESS_BY_OTHER_PROC = 268447462;
    public static final int KM_TAG_ALLOW_WHILE_ON_BODY = 1879048698;
    public static final int KM_TAG_ALL_APPLICATIONS = 1879048792;
    public static final int KM_TAG_ALL_USERS = 1879048692;
    public static final int KM_TAG_APPLICATION_ID = -1879047591;
    public static final int KM_TAG_APP_PACKAGE_NAME = -1879036190;
    public static final int KM_TAG_APP_PACKAGE_PUBKEY = -1879036189;
    public static final int KM_TAG_ASSETSTORE_ACCESSLIMITATION = 268525463;
    public static final int KM_TAG_ASSETSTORE_ACCOUNTLIMIT = -1878958173;
    public static final int KM_TAG_ASSETSTORE_AEADASSET = -1878958190;
    public static final int KM_TAG_ASSETSTORE_ALLOWACCESSBYOTHERPROC = 268533470;
    public static final int KM_TAG_ASSETSTORE_APPTAG = -1878958192;
    public static final int KM_TAG_ASSETSTORE_ASSETHANDLE = -1878958184;
    public static final int KM_TAG_ASSETSTORE_ASSETTYPE = 268525459;
    public static final int KM_TAG_ASSETSTORE_AUTHENTICATELIMITATION = 268525461;
    public static final int KM_TAG_ASSETSTORE_BASE_PWD = -1878958148;
    public static final int KM_TAG_ASSETSTORE_BATCHASSET = -1878958191;
    public static final int KM_TAG_ASSETSTORE_BATCH_SELECT = 268525489;
    public static final int KM_TAG_ASSETSTORE_CERT_PK = -1878958174;
    public static final int KM_TAG_ASSETSTORE_CLOUDSYNCLIMIT = 268525482;
    public static final int KM_TAG_ASSETSTORE_CONTEXT_PUBKEY = -1878958180;
    public static final int KM_TAG_ASSETSTORE_DATA_CREATOR = -1878958175;
    public static final int KM_TAG_ASSETSTORE_DATA_OWNER = -1878958176;
    public static final int KM_TAG_ASSETSTORE_EXTINFO = -1878958188;
    public static final int KM_TAG_ASSETSTORE_GUID = -1878958172;
    public static final int KM_TAG_ASSETSTORE_ISDELETE = 268525483;
    public static final int KM_TAG_ASSETSTORE_ISDIRTY = 268525484;
    public static final int KM_TAG_ASSETSTORE_IS_SYNC_APP = 268525496;
    public static final int KM_TAG_ASSETSTORE_KEYALIAS = -1878958177;
    public static final int KM_TAG_ASSETSTORE_LOCALLIMIT = 268525481;
    public static final int KM_TAG_ASSETSTORE_OPCODE = 268525466;
    public static final int KM_TAG_ASSETSTORE_OPERATION_HANDLE = -1878958147;
    public static final int KM_TAG_ASSETSTORE_OTHERSYNCLIMIT = 268525479;
    public static final int KM_TAG_ASSETSTORE_OWNER_ID = -1878958157;
    public static final int KM_TAG_ASSETSTORE_PROCESS_TYPE = 268525494;
    public static final int KM_TAG_ASSETSTORE_RESETFLAG = 268525465;
    public static final int KM_TAG_ASSETSTORE_SELECT_FLAG = 268525488;
    public static final int KM_TAG_ASSETSTORE_SERVICE_ID = -1878958158;
    public static final int KM_TAG_ASSETSTORE_SIGNATURE_DATA = -1878958161;
    public static final int KM_TAG_ASSETSTORE_SRCDATA = -1878958162;
    public static final int KM_TAG_ASSETSTORE_SYNCLIMITATION = 268525462;
    public static final int KM_TAG_ASSETSTORE_SYNCPOLICY = -1878958155;
    public static final int KM_TAG_ASSETSTORE_SYN_APP_DATA = 268525495;
    public static final int KM_TAG_ASSETSTORE_TARGET_ALGEXTINFO = -1878950184;
    public static final int KM_TAG_ASSETSTORE_TARGET_ALGPAR = -1878950189;
    public static final int KM_TAG_ASSETSTORE_TARGET_ALGTYPE = 268533458;
    public static final int KM_TAG_ASSETSTORE_TARGET_ALLOWWRAP = 268533465;
    public static final int KM_TAG_ASSETSTORE_TARGET_BLOCKMODE = 268533462;
    public static final int KM_TAG_ASSETSTORE_TARGET_DERIVEFACTOR = -1878950179;
    public static final int KM_TAG_ASSETSTORE_TARGET_DIGESTALG = 268533463;
    public static final int KM_TAG_ASSETSTORE_TARGET_KEYALIAS = -1878958163;
    public static final int KM_TAG_ASSETSTORE_TARGET_KEYGENERATETYPE = 268533467;
    public static final int KM_TAG_ASSETSTORE_TARGET_KEYLENGTH = 268533457;
    public static final int KM_TAG_ASSETSTORE_TARGET_MASTERKEYALIAS = -1878950180;
    public static final int KM_TAG_ASSETSTORE_TARGET_PADDING = 268533461;
    public static final int KM_TAG_ASSETSTORE_TARGET_PURPOSE = 268533460;
    public static final int KM_TAG_ASSETSTORE_TARGET_WRAPKEYTYPE = 268533466;
    public static final int KM_TAG_ASSETSTORE_TEELIMIT = 268525480;
    public static final int KM_TAG_ASSETSTORE_TEESTORAGE = 268525478;
    public static final int KM_TAG_ASSETSTORE_TRANSFER_DATA = -1878958181;
    public static final int KM_TAG_ASSETSTORE_TRANSFER_ECDH_ALIAS = -1878958178;
    public static final int KM_TAG_ASSETSTORE_TRANSFER_ECDH_PUBKEY = -1878958179;
    public static final int KM_TAG_ASSETSTORE_UNSTRUCTUUID = -1878958171;
    public static final int KM_TAG_ASSETSTORE_UPDATE_FLAG = 268525492;
    public static final int KM_TAG_ASSOCIATED_DATA = -1879047192;
    public static final int KM_TAG_ATTESTATION_APPLICATION_ID = -1879047483;
    public static final int KM_TAG_ATTESTATION_CERT_CHAIN = -1878948991;
    public static final int KM_TAG_ATTESTATION_CHALLENGE = -1879047484;
    public static final int KM_TAG_ATTESTATION_ID_BRAND = -1879047482;
    public static final int KM_TAG_ATTESTATION_ID_DEVICE = -1879047481;
    public static final int KM_TAG_ATTESTATION_ID_IMEI = -1879047478;
    public static final int KM_TAG_ATTESTATION_ID_MANUFACTURER = -1879047476;
    public static final int KM_TAG_ATTESTATION_ID_MEID = -1879047477;
    public static final int KM_TAG_ATTESTATION_ID_MODEL = -1879047475;
    public static final int KM_TAG_ATTESTATION_ID_PRODUCT = -1879047480;
    public static final int KM_TAG_ATTESTATION_ID_SERIAL = -1879047479;
    public static final int KM_TAG_ATTESTATION_ID_UDID = -1879038186;
    public static final int KM_TAG_ATTESTATION_SESSION = -1879047442;
    public static final int KM_TAG_AUTH_TIMEOUT = 805306873;
    public static final int KM_TAG_AUTH_TOKEN = -1879047190;
    public static final int KM_TAG_BLOB_USAGE_REQUIREMENTS = 268436161;
    public static final int KM_TAG_BLOCK_MODE = 536870916;
    public static final int KM_TAG_CALLER_NONCE = 1879048199;
    public static final int KM_TAG_CLOUD_SYNC_ACCOUNT_UID = -1879036191;
    public static final int KM_TAG_CREATION_DATETIME = 1610613437;
    public static final int KM_TAG_DERIVE_FACTOR = -1878949091;
    public static final int KM_TAG_DERIVE_KEY_ALG = 268447464;
    public static final int KM_TAG_DERIVE_MASTER_KEY = -1879036187;
    public static final int KM_TAG_DIGEST = 536870917;
    public static final int KM_TAG_INCLUDE_UNIQUE_ID = 1879048394;
    public static final int KM_TAG_INVALID = 0;
    public static final int KM_TAG_INVALIDATED_BY_ROOTING = 1879058197;
    public static final int KM_TAG_IS_FROM_GM = 1879147593;
    public static final int KM_TAG_KEY_AGREEMENT_ALG = 268447467;
    public static final int KM_TAG_KEY_DERIVE_LABEL = -1879036182;
    public static final int KM_TAG_KEY_DERIVE_SALT = -1879036183;
    public static final int KM_TAG_KEY_GENERATE_TYPE = 268447460;
    public static final int KM_TAG_KEY_SIZE = 805306371;
    public static final int KM_TAG_MAC_LENGTH = 805307371;
    public static final int KM_TAG_MAX_USES_PER_BOOT = 805306772;
    public static final int KM_TAG_MIN_MAC_LENGTH = 805306376;
    public static final int KM_TAG_MIN_SECONDS_BETWEEN_OPS = 805306771;
    public static final int KM_TAG_NONCE = -1879047191;
    public static final int KM_TAG_NO_AUTH_REQUIRED = 1879048695;
    public static final int KM_TAG_ORIGIN = 268436158;
    public static final int KM_TAG_ORIGINATION_EXPIRE_DATETIME = 1610613137;
    public static final int KM_TAG_PADDING = 536870918;
    public static final int KM_TAG_PURPOSE = 536870913;
    public static final int KM_TAG_RESCOPING_ADD = 536871013;
    public static final int KM_TAG_RESCOPING_DEL = 536871014;
    public static final int KM_TAG_ROLLBACK_RESISTANT = 1879048895;
    public static final int KM_TAG_ROOT_OF_TRUST = -1879047488;
    public static final int KM_TAG_RSA_PUBLIC_EXPONENT = 1342177480;
    public static final int KM_TAG_SOTER_AUTO_ADD_COUNTER_WHEN_GET_PUBLIC_KEY = 1879059196;
    public static final int KM_TAG_SOTER_AUTO_SIGNED_COMMON_KEY_WHEN_GET_PUBLIC_KEY = -1879037189;
    public static final int KM_TAG_SOTER_AUTO_SIGNED_COMMON_KEY_WHEN_GET_PUBLIC_KEY_BLOB = -1879037184;
    public static final int KM_TAG_SOTER_IS_AUTO_SIGNED_WITH_COMMON_KEY_WHEN_GET_PUBLIC_KEY = 1879059194;
    public static final int KM_TAG_SOTER_IS_FROM_SOTER = 1879059192;
    public static final int KM_TAG_SOTER_IS_SECMSG_FID_COUNTER_SIGNED_WHEN_SIGN = 1879059197;
    public static final int KM_TAG_SOTER_UID = 805317375;
    public static final int KM_TAG_SOTER_USE_NEXT_ATTK = 1879059198;
    public static final int KM_TAG_TEE_OUTGOING_TYPE = 268447456;
    public static final int KM_TAG_UNIQUE_ID = -1879047485;
    public static final int KM_TAG_USAGE_EXPIRE_DATETIME = 1610613138;
    public static final int KM_TAG_USER_AUTH_TYPE = 268435960;
    public static final int KM_TAG_USER_ID = 805306869;
    public static final int KM_TAG_USER_SECURE_ID = -1610612234;
    public static final int KM_TAG_WRAP_KEY_TYPE = 268447463;
    public static final int KM_UINT = 805306368;
    public static final int KM_UINT_REP = 1073741824;
    public static final int KM_ULONG = 1342177280;
    public static final int KM_ULONG_REP = -1610612736;
    private static final int MAX_NUM_OF_ERROR_CODE = 40;

    private HwKeymasterDefs() {
    }

    static {
        ERROR_CODE_TO_STRING.put(0, "OK");
        ERROR_CODE_TO_STRING.put(-2, "Unsupported purpose");
        ERROR_CODE_TO_STRING.put(-3, "Incompatible purpose");
        ERROR_CODE_TO_STRING.put(-4, "Unsupported algorithm");
        ERROR_CODE_TO_STRING.put(-5, "Incompatible algorithm");
        ERROR_CODE_TO_STRING.put(-6, "Unsupported key size");
        ERROR_CODE_TO_STRING.put(-7, "Unsupported block mode");
        ERROR_CODE_TO_STRING.put(-8, "Incompatible block mode");
        ERROR_CODE_TO_STRING.put(-9, "Unsupported MAC or authentication tag length");
        ERROR_CODE_TO_STRING.put(-10, "Unsupported padding mode");
        ERROR_CODE_TO_STRING.put(-11, "Incompatible padding mode");
        ERROR_CODE_TO_STRING.put(-12, "Unsupported digest");
        ERROR_CODE_TO_STRING.put(-13, "Incompatible digest");
        ERROR_CODE_TO_STRING.put(-14, "Invalid expiration time");
        ERROR_CODE_TO_STRING.put(-15, "Invalid user ID");
        ERROR_CODE_TO_STRING.put(-16, "Invalid user authorization timeout");
        ERROR_CODE_TO_STRING.put(-17, "Unsupported key format");
        ERROR_CODE_TO_STRING.put(-18, "Incompatible key format");
        ERROR_CODE_TO_STRING.put(-21, "Invalid input length");
        ERROR_CODE_TO_STRING.put(-24, "Key not yet valid");
        ERROR_CODE_TO_STRING.put(-25, "Key expired");
        ERROR_CODE_TO_STRING.put(-26, "Key user not authenticated");
        ERROR_CODE_TO_STRING.put(-28, "Invalid operation handle");
        ERROR_CODE_TO_STRING.put(-30, "Signature/MAC verification failed");
        ERROR_CODE_TO_STRING.put(-31, "Too many operations");
        ERROR_CODE_TO_STRING.put(-33, "Invalid key blob");
        ERROR_CODE_TO_STRING.put(-38, "Invalid argument");
        ERROR_CODE_TO_STRING.put(-39, "Unsupported tag");
        ERROR_CODE_TO_STRING.put(-40, "Invalid tag");
        ERROR_CODE_TO_STRING.put(-41, "Memory allocation failed");
        ERROR_CODE_TO_STRING.put(-50, "Unsupported EC field");
        ERROR_CODE_TO_STRING.put(-51, "Required IV missing");
        ERROR_CODE_TO_STRING.put(-52, "Invalid IV");
        ERROR_CODE_TO_STRING.put(-55, "Caller-provided IV not permitted");
        ERROR_CODE_TO_STRING.put(-57, "Invalid MAC or authentication tag length");
        ERROR_CODE_TO_STRING.put(-100, "Not implemented");
        ERROR_CODE_TO_STRING.put(Integer.valueOf((int) KM_ERROR_UNKNOWN_ERROR), "Unknown error");
    }

    public static int getTagType(int tag) {
        return -268435456 & tag;
    }

    public static String getErrorMessage(int errorCode) {
        String result = ERROR_CODE_TO_STRING.get(Integer.valueOf(errorCode));
        if (result != null) {
            return result;
        }
        return String.valueOf(errorCode);
    }
}
