package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MechanicsType {

    DIRECT_DISCOUNT("DIRECT_DISCOUNT"),
    
    BLUE_FLASH("BLUE_FLASH"),
    
    MARKET_PROMOCODE("MARKET_PROMOCODE")

    private final String value

    MechanicsType(String value) {
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
