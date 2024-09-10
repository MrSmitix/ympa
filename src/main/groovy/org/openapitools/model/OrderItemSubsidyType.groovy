package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderItemSubsidyType {

    YANDEX_CASHBACK("YANDEX_CASHBACK"),
    
    SUBSIDY("SUBSIDY")

    private final String value

    OrderItemSubsidyType(String value) {
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
