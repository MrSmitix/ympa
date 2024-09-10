package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedIndexLogsErrorType {

    DOWNLOAD_ERROR("DOWNLOAD_ERROR"),
    
    DOWNLOAD_HTTP_ERROR("DOWNLOAD_HTTP_ERROR"),
    
    PARSE_ERROR("PARSE_ERROR"),
    
    PARSE_XML_ERROR("PARSE_XML_ERROR"),
    
    TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS"),
    
    NOT_INDEXED("NOT_INDEXED")

    private final String value

    FeedIndexLogsErrorType(String value) {
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
