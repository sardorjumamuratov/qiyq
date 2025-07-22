package com.sardor.enumeration.headers;

import com.sardor.enumeration.EnumUtils;

public enum GeneralHeader implements EnumUtils {
    CACHE_CONTROL("Cache-Control"),
    CONNECTION("Connection"),
    DATE("Date"),
    TRANSFER_ENCODING("Transfer-Encoding"),
    WARNING("Warning")

    ;
    private final String headerName;


    GeneralHeader(String headerName) {
        this.headerName = headerName;
    }

}
