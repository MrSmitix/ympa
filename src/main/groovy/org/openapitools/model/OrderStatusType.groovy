package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderStatusType {

    PLACING("PLACING"),
    
    RESERVED("RESERVED"),
    
    UNPAID("UNPAID"),
    
    PROCESSING("PROCESSING"),
    
    DELIVERY("DELIVERY"),
    
    PICKUP("PICKUP"),
    
    DELIVERED("DELIVERED"),
    
    CANCELLED("CANCELLED"),
    
    PENDING("PENDING"),
    
    PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
    
    RETURNED("RETURNED"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderStatusType(String value) {
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
