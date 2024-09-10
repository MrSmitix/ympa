package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LicenseCheckStatusType {

    NEW("NEW"),
    
    SUCCESS("SUCCESS"),
    
    FAIL("FAIL"),
    
    REVOKE("REVOKE"),
    
    DONT_WANT("DONT_WANT"),
    
    FAIL_MANUAL("FAIL_MANUAL")

    private final String value

    LicenseCheckStatusType(String value) {
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
