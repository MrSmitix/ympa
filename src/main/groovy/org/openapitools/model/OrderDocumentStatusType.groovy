package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDocumentStatusType {

    READY("READY"),
    
    NOT_READY("NOT_READY")

    private final String value

    OrderDocumentStatusType(String value) {
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
