package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedContentErrorType {

    PARSE_ERROR("PARSE_ERROR"),
    
    PARSE_XML_ERROR("PARSE_XML_ERROR"),
    
    TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS")

    private final String value

    FeedContentErrorType(String value) {
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
