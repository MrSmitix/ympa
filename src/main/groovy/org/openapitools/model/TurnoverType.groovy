package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TurnoverType {

    LOW("LOW"),
    
    ALMOST_LOW("ALMOST_LOW"),
    
    HIGH("HIGH"),
    
    VERY_HIGH("VERY_HIGH"),
    
    NO_SALES("NO_SALES"),
    
    FREE_STORE("FREE_STORE")

    private final String value

    TurnoverType(String value) {
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
