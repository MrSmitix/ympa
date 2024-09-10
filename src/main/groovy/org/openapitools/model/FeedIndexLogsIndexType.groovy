package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedIndexLogsIndexType {

    DIFF("DIFF"),
    
    FAST_PRICE("FAST_PRICE"),
    
    FULL("FULL")

    private final String value

    FeedIndexLogsIndexType(String value) {
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
