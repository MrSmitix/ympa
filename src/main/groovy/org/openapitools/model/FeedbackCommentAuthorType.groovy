package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedbackCommentAuthorType {

    USER("USER"),
    
    SHOP("SHOP")

    private final String value

    FeedbackCommentAuthorType(String value) {
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
