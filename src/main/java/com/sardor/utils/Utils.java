package com.sardor.utils;

public final class Utils {
    public static String ifValidThenGet(String uri) {
        // todo : change impl
        // log & check for validity
        uri = normalizeURI(uri);
        if (1 == 1) {
            return uri;
        }

        throw new IllegalStateException("not valid"); // todo : customize
    }

    private static String normalizeURI(String uri) {
        return uri; // todo : change impl
    }

    private Utils() {}
}
