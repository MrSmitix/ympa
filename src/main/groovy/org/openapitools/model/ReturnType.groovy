package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnType {

    UNREDEEMED("UNREDEEMED"),
    
    RETURN("RETURN")

    private final String value

    ReturnType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
