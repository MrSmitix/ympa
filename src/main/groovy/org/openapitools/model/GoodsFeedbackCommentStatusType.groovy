package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum GoodsFeedbackCommentStatusType {

    PUBLISHED("PUBLISHED"),
    
    UNMODERATED("UNMODERATED"),
    
    BANNED("BANNED"),
    
    DELETED("DELETED")

    private final String value

    GoodsFeedbackCommentStatusType(String value) {
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
