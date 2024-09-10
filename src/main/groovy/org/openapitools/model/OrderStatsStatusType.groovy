package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderStatsStatusType {

    CANCELLED_BEFORE_PROCESSING("CANCELLED_BEFORE_PROCESSING"),
    
    CANCELLED_IN_DELIVERY("CANCELLED_IN_DELIVERY"),
    
    CANCELLED_IN_PROCESSING("CANCELLED_IN_PROCESSING"),
    
    DELIVERY("DELIVERY"),
    
    DELIVERED("DELIVERED"),
    
    PARTIALLY_DELIVERED("PARTIALLY_DELIVERED"),
    
    PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
    
    PENDING("PENDING"),
    
    PICKUP("PICKUP"),
    
    PROCESSING("PROCESSING"),
    
    RESERVED("RESERVED"),
    
    RETURNED("RETURNED"),
    
    UNKNOWN("UNKNOWN"),
    
    UNPAID("UNPAID"),
    
    LOST("LOST")

    private final String value

    OrderStatsStatusType(String value) {
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
