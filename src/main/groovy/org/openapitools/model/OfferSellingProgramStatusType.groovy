package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferSellingProgramStatusType {

    FINE("FINE"),
    
    REJECT("REJECT")

    private final String value

    OfferSellingProgramStatusType(String value) {
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
