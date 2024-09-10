package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReportStatusType {

    PENDING("PENDING"),
    
    PROCESSING("PROCESSING"),
    
    FAILED("FAILED"),
    
    DONE("DONE")

    private final String value

    ReportStatusType(String value) {
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
