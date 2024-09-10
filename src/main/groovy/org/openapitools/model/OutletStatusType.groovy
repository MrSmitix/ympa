package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OutletStatusType {

    AT_MODERATION("AT_MODERATION"),
    
    FAILED("FAILED"),
    
    MODERATED("MODERATED"),
    
    NONMODERATED("NONMODERATED"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OutletStatusType(String value) {
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
