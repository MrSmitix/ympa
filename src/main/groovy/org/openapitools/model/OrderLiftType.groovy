package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderLiftType {

    NOT_NEEDED("NOT_NEEDED"),
    
    MANUAL("MANUAL"),
    
    ELEVATOR("ELEVATOR"),
    
    CARGO_ELEVATOR("CARGO_ELEVATOR"),
    
    FREE("FREE"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderLiftType(String value) {
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
