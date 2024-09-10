package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderCancellationReasonType {

    DELIVERED("ORDER_DELIVERED"),
    
    IN_DELIVERY("ORDER_IN_DELIVERY")

    private final String value

    OrderCancellationReasonType(String value) {
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
