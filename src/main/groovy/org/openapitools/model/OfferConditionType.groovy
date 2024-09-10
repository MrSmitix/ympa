package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferConditionType {

    PREOWNED("PREOWNED"),
    
    SHOWCASESAMPLE("SHOWCASESAMPLE"),
    
    REFURBISHED("REFURBISHED"),
    
    REDUCTION("REDUCTION"),
    
    RENOVATED("RENOVATED"),
    
    NOT_SPECIFIED("NOT_SPECIFIED")

    private final String value

    OfferConditionType(String value) {
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
