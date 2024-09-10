package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDeliveryDateReasonType {

    USER_MOVED_DELIVERY_DATES("USER_MOVED_DELIVERY_DATES"),
    
    PARTNER_MOVED_DELIVERY_DATES("PARTNER_MOVED_DELIVERY_DATES")

    private final String value

    OrderDeliveryDateReasonType(String value) {
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
