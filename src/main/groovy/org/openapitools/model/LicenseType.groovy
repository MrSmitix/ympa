package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LicenseType {

    ALCOHOL("ALCOHOL"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    LicenseType(String value) {
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
