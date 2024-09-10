package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderItemsModificationRequestReasonType {

    PARTNER_REQUESTED_REMOVE("PARTNER_REQUESTED_REMOVE"),
    
    USER_REQUESTED_REMOVE("USER_REQUESTED_REMOVE")

    private final String value

    OrderItemsModificationRequestReasonType(String value) {
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
