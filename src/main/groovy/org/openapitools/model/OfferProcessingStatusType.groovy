package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferProcessingStatusType {

    UNKNOWN("UNKNOWN"),
    
    READY("READY"),
    
    IN_WORK("IN_WORK"),
    
    NEED_INFO("NEED_INFO"),
    
    NEED_MAPPING("NEED_MAPPING"),
    
    NEED_CONTENT("NEED_CONTENT"),
    
    CONTENT_PROCESSING("CONTENT_PROCESSING"),
    
    SUSPENDED("SUSPENDED"),
    
    REJECTED("REJECTED"),
    
    REVIEW("REVIEW"),
    
    CREATE_ERROR("CREATE_ERROR"),
    
    UPDATE_ERROR("UPDATE_ERROR")

    private final String value

    OfferProcessingStatusType(String value) {
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
