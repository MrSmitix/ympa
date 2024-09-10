package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PromoOfferParticipationStatusFilterType {

    MANUALLY_ADDED("MANUALLY_ADDED"),
    
    NOT_MANUALLY_ADDED("NOT_MANUALLY_ADDED")

    private final String value

    PromoOfferParticipationStatusFilterType(String value) {
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
