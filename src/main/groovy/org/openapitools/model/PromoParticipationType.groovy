package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PromoParticipationType {

    PARTICIPATING_NOW("PARTICIPATING_NOW"),
    
    PARTICIPATED("PARTICIPATED")

    private final String value

    PromoParticipationType(String value) {
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
