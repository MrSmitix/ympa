package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferMappingKindType {

    ACTIVE("ACTIVE"),
    
    ALL("ALL")

    private final String value

    OfferMappingKindType(String value) {
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
