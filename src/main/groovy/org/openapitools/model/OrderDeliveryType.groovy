package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDeliveryType {

    DELIVERY("DELIVERY"),
    
    PICKUP("PICKUP"),
    
    POST("POST"),
    
    DIGITAL("DIGITAL"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderDeliveryType(String value) {
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
