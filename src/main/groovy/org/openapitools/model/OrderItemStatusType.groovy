package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderItemStatusType {

    REJECTED("REJECTED"),
    
    RETURNED("RETURNED")

    private final String value

    OrderItemStatusType(String value) {
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
