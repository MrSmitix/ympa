package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CategoryErrorType {

    UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
    
    CATEGORY_IS_NOT_LEAF("CATEGORY_IS_NOT_LEAF")

    private final String value

    CategoryErrorType(String value) {
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
