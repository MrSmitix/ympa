package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderPaymentType {

    PREPAID("PREPAID"),
    
    POSTPAID("POSTPAID"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderPaymentType(String value) {
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
