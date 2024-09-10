package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PriceQuarantineVerdictType {

    PRICE_CHANGE("PRICE_CHANGE"),
    
    LOW_PRICE("LOW_PRICE"),
    
    LOW_PRICE_PROMO("LOW_PRICE_PROMO")

    private final String value

    PriceQuarantineVerdictType(String value) {
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
