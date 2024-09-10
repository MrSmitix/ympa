package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SellingProgramType {

    FBY("FBY"),
    
    FBS("FBS"),
    
    DBS("DBS"),
    
    EXPRESS("EXPRESS")

    private final String value

    SellingProgramType(String value) {
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
