package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsStockType {

    FIT("FIT"),
    
    FREEZE("FREEZE"),
    
    AVAILABLE("AVAILABLE"),
    
    QUARANTINE("QUARANTINE"),
    
    UTILIZATION("UTILIZATION"),
    
    DEFECT("DEFECT"),
    
    EXPIRED("EXPIRED")

    private final String value

    OrdersStatsStockType(String value) {
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
