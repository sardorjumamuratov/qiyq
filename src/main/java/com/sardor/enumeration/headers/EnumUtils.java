package com.sardor.enumeration.headers;

public interface EnumUtils {
    static <T extends Enum<T> & EnumUtils> T fromString(Class<T> enumType, String value) {
        for (T constant : enumType.getEnumConstants()) {
            if (constant.name().equalsIgnoreCase(value)) {
                return constant;
            }
        }
        throw new IllegalArgumentException("Unsupported header in " + enumType.getSimpleName() + ": " + value);
    }

}
