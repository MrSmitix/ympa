package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsPaymentType {

    PAYMENT("PAYMENT"),
    
    REFUND("REFUND"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrdersStatsPaymentType(String value) {
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
