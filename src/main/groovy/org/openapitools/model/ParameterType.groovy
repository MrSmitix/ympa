package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ParameterType {

    TEXT("TEXT"),
    
    ENUM("ENUM"),
    
    BOOLEAN("BOOLEAN"),
    
    NUMERIC("NUMERIC")

    private final String value

    ParameterType(String value) {
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
