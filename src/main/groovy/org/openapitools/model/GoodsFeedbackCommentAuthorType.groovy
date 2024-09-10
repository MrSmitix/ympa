package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum GoodsFeedbackCommentAuthorType {

    USER("USER"),
    
    BUSINESS("BUSINESS")

    private final String value

    GoodsFeedbackCommentAuthorType(String value) {
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
