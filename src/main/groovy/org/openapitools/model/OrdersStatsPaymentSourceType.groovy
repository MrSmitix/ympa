package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsPaymentSourceType {

    BUYER("BUYER"),
    
    CASHBACK("CASHBACK"),
    
    MARKETPLACE("MARKETPLACE"),
    
    SPLIT("SPLIT")

    private final String value

    OrdersStatsPaymentSourceType(String value) {
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
