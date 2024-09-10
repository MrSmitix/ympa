package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferConditionQualityType {

    PERFECT("PERFECT"),
    
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    NOT_SPECIFIED("NOT_SPECIFIED")

    private final String value

    OfferConditionQualityType(String value) {
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
