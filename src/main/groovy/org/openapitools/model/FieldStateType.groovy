package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FieldStateType {

    SPECIFIED("SPECIFIED"),
    
    EMPTY("EMPTY")

    private final String value

    FieldStateType(String value) {
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
