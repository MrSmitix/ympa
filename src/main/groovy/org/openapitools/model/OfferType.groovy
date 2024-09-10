package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferType {

    DEFAULT("DEFAULT"),
    
    MEDICINE("MEDICINE"),
    
    BOOK("BOOK"),
    
    AUDIOBOOK("AUDIOBOOK"),
    
    ARTIST_TITLE("ARTIST_TITLE"),
    
    ON_DEMAND("ON_DEMAND")

    private final String value

    OfferType(String value) {
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
