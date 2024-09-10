package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PaymentFrequencyType {

    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    BIWEEKLY("BIWEEKLY"),
    
    MONTHLY("MONTHLY")

    private final String value

    PaymentFrequencyType(String value) {
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
