package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PriceSuggestType {

    BUYBOX("BUYBOX"),
    
    DEFAULT_OFFER("DEFAULT_OFFER"),
    
    MIN_PRICE_MARKET("MIN_PRICE_MARKET")

    private final String value

    PriceSuggestType(String value) {
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
