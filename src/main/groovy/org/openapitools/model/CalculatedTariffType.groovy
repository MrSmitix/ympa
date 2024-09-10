package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CalculatedTariffType {

    AGENCY_COMMISSION("AGENCY_COMMISSION"),
    
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
    
    FEE("FEE"),
    
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
    
    CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
    
    EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
    
    SORTING("SORTING"),
    
    MIDDLE_MILE("MIDDLE_MILE")

    private final String value

    CalculatedTariffType(String value) {
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
