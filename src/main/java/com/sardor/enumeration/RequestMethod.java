package com.sardor.enumeration;

import java.util.Arrays;

public enum RequestMethod {

    GET,
    POST,
    DELETE,
    PUT;

    private final static RequestMethod[] requestMethods = RequestMethod.values();

    public static RequestMethod getByNameOrThrow(String name) {
        return Arrays.stream(RequestMethod.values())
                .filter(method -> method.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid HTTP method: " + name));
    }

}
