package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EacVerificationStatusType {

    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED"),
    
    NEED_UPDATE("NEED_UPDATE")

    private final String value

    EacVerificationStatusType(String value) {
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
