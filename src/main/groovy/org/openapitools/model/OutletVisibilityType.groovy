package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OutletVisibilityType {

    HIDDEN("HIDDEN"),
    
    VISIBLE("VISIBLE"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OutletVisibilityType(String value) {
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
