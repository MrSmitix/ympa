package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RecipientType {

    SHOP("SHOP"),
    
    DELIVERY_SERVICE("DELIVERY_SERVICE"),
    
    POST("POST")

    private final String value

    RecipientType(String value) {
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
