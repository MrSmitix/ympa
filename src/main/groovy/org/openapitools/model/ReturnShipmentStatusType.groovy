package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnShipmentStatusType {

    CREATED("CREATED"),
    
    RECEIVED("RECEIVED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    
    PICKED("PICKED"),
    
    LOST("LOST"),
    
    EXPIRED("EXPIRED"),
    
    CANCELLED("CANCELLED"),
    
    FULFILMENT_RECEIVED("FULFILMENT_RECEIVED"),
    
    PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
    
    NOT_IN_DEMAND("NOT_IN_DEMAND"),
    
    UTILIZED("UTILIZED"),
    
    READY_FOR_EXPROPRIATION("READY_FOR_EXPROPRIATION"),
    
    RECEIVED_FOR_EXPROPRIATION("RECEIVED_FOR_EXPROPRIATION")

    private final String value

    ReturnShipmentStatusType(String value) {
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
