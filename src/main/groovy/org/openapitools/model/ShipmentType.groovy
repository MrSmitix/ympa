package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ShipmentType {

    IMPORT("IMPORT"),
    
    WITHDRAW("WITHDRAW")

    private final String value

    ShipmentType(String value) {
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
