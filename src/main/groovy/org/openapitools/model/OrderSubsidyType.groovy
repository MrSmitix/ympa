package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderSubsidyType {

    YANDEX_CASHBACK("YANDEX_CASHBACK"),
    
    SUBSIDY("SUBSIDY"),
    
    DELIVERY("DELIVERY")

    private final String value

    OrderSubsidyType(String value) {
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
