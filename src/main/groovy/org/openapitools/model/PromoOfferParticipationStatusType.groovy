package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PromoOfferParticipationStatusType {

    AUTO("AUTO"),
    
    PARTIALLY_AUTO("PARTIALLY_AUTO"),
    
    MANUAL("MANUAL"),
    
    NOT_PARTICIPATING("NOT_PARTICIPATING")

    private final String value

    PromoOfferParticipationStatusType(String value) {
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
