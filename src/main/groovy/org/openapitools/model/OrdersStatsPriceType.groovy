package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsPriceType {

    BUYER("BUYER"),
    
    CASHBACK("CASHBACK"),
    
    MARKETPLACE("MARKETPLACE")

    private final String value

    OrdersStatsPriceType(String value) {
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
