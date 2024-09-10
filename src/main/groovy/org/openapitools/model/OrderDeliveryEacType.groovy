package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDeliveryEacType {

    MERCHANT_TO_COURIER("MERCHANT_TO_COURIER"),
    
    COURIER_TO_MERCHANT("COURIER_TO_MERCHANT"),
    
    CHECKING_BY_MERCHANT("CHECKING_BY_MERCHANT")

    private final String value

    OrderDeliveryEacType(String value) {
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
