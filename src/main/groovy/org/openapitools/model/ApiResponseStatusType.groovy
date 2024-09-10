package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ApiResponseStatusType {

    OK("OK"),
    
    ERROR("ERROR")

    private final String value

    ApiResponseStatusType(String value) {
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
