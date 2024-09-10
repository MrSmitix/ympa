package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LogisticPointType {

    WAREHOUSE("WAREHOUSE"),
    
    PICKUP_POINT("PICKUP_POINT"),
    
    PICKUP_TERMINAL("PICKUP_TERMINAL"),
    
    PICKUP_POST_OFFICE("PICKUP_POST_OFFICE"),
    
    PICKUP_MIXED("PICKUP_MIXED"),
    
    PICKUP_RETAIL("PICKUP_RETAIL"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    LogisticPointType(String value) {
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
