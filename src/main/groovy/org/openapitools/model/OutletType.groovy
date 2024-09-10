package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OutletType {

    DEPOT("DEPOT"),
    
    MIXED("MIXED"),
    
    RETAIL("RETAIL"),
    
    NOT_DEFINED("NOT_DEFINED")

    private final String value

    OutletType(String value) {
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
