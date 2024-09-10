package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedIndexLogsStatusType {

    ERROR("ERROR"),
    
    OK("OK"),
    
    WARNING("WARNING")

    private final String value

    FeedIndexLogsStatusType(String value) {
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
