package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedbackReactionStatusType {

    ALL("ALL"),
    
    NEED_REACTION("NEED_REACTION")

    private final String value

    FeedbackReactionStatusType(String value) {
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
