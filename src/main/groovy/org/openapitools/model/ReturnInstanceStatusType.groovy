package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnInstanceStatusType {

    CREATED("CREATED"),
    
    RECEIVED("RECEIVED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    
    PICKED("PICKED"),
    
    RECEIVED_ON_FULFILLMENT("RECEIVED_ON_FULFILLMENT"),
    
    CANCELLED("CANCELLED"),
    
    LOST("LOST"),
    
    UTILIZED("UTILIZED"),
    
    PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
    
    EXPROPRIATED("EXPROPRIATED"),
    
    NOT_IN_DEMAND("NOT_IN_DEMAND")

    private final String value

    ReturnInstanceStatusType(String value) {
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
