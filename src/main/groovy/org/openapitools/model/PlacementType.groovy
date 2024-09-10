package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PlacementType {

    FBS("FBS"),
    
    FBY("FBY"),
    
    DBS("DBS")

    private final String value

    PlacementType(String value) {
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
