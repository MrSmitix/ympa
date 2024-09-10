package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PriceCompetitivenessType {

    OPTIMAL("OPTIMAL"),
    
    AVERAGE("AVERAGE"),
    
    LOW("LOW")

    private final String value

    PriceCompetitivenessType(String value) {
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
