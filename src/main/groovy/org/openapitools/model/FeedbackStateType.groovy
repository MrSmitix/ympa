package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedbackStateType {

    LAST("LAST"),
    
    PREVIOUS("PREVIOUS"),
    
    DELETED("DELETED")

    private final String value

    FeedbackStateType(String value) {
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
