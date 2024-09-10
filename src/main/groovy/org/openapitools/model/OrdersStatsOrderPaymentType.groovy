package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsOrderPaymentType {

    CREDIT("CREDIT"),
    
    POSTPAID("POSTPAID"),
    
    PREPAID("PREPAID"),
    
    TINKOFF_CREDIT("TINKOFF_CREDIT")

    private final String value

    OrdersStatsOrderPaymentType(String value) {
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
