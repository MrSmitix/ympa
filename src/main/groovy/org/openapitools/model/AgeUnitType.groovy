package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AgeUnitType {

    YEAR("YEAR"),
    
    MONTH("MONTH")

    private final String value

    AgeUnitType(String value) {
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
