package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderItemInstanceType {

    CIS("CIS"),
    
    UIN("UIN"),
    
    RNPT("RNPT"),
    
    GTD("GTD")

    private final String value

    OrderItemInstanceType(String value) {
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
