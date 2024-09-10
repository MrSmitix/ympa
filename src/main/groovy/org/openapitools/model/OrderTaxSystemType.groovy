package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderTaxSystemType {

    OSN("OSN"),
    
    USN("USN"),
    
    USN_MINUS_COST("USN_MINUS_COST"),
    
    ENVD("ENVD"),
    
    ECHN("ECHN"),
    
    PSN("PSN"),
    
    NPD("NPD"),
    
    UNKNOWN_VALUE("UNKNOWN_VALUE")

    private final String value

    OrderTaxSystemType(String value) {
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
