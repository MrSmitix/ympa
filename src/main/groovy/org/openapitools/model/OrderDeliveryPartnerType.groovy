package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDeliveryPartnerType {

    SHOP("SHOP"),
    
    YANDEX_MARKET("YANDEX_MARKET"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderDeliveryPartnerType(String value) {
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
