package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderBuyerType {

    PERSON("PERSON"),
    
    BUSINESS("BUSINESS")

    private final String value

    OrderBuyerType(String value) {
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
