package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferAvailabilityStatusType {

    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    DELISTED("DELISTED")

    private final String value

    OfferAvailabilityStatusType(String value) {
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
