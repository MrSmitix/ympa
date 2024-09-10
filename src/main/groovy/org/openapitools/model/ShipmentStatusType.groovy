package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ShipmentStatusType {

    OUTBOUND_CREATED("OUTBOUND_CREATED"),
    
    OUTBOUND_READY_FOR_CONFIRMATION("OUTBOUND_READY_FOR_CONFIRMATION"),
    
    OUTBOUND_CONFIRMED("OUTBOUND_CONFIRMED"),
    
    OUTBOUND_SIGNED("OUTBOUND_SIGNED"),
    
    FINISHED("FINISHED"),
    
    ACCEPTED("ACCEPTED"),
    
    ACCEPTED_WITH_DISCREPANCIES("ACCEPTED_WITH_DISCREPANCIES"),
    
    ERROR("ERROR")

    private final String value

    ShipmentStatusType(String value) {
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
