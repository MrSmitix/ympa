package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedStatusType {

    ERROR("ERROR"),
    
    NA("NA"),
    
    OK("OK")

    private final String value

    FeedStatusType(String value) {
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
