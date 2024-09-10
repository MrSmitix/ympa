package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AddOffersToArchiveErrorType {

    OFFER_HAS_STOCKS("OFFER_HAS_STOCKS"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    AddOffersToArchiveErrorType(String value) {
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
