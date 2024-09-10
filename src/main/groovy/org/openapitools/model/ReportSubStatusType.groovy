package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReportSubStatusType {

    NO_DATA("NO_DATA"),
    
    TOO_LARGE("TOO_LARGE"),
    
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND")

    private final String value

    ReportSubStatusType(String value) {
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
