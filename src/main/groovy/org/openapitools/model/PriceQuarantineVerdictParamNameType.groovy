package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PriceQuarantineVerdictParamNameType {

    CURRENT_PRICE("CURRENT_PRICE"),
    
    LAST_VALID_PRICE("LAST_VALID_PRICE"),
    
    MIN_PRICE("MIN_PRICE"),
    
    CURRENCY("CURRENCY")

    private final String value

    PriceQuarantineVerdictParamNameType(String value) {
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
