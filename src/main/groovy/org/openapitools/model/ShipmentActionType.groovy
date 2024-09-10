package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ShipmentActionType {

    CONFIRM("CONFIRM"),
    
    DOWNLOAD_ACT("DOWNLOAD_ACT"),
    
    DOWNLOAD_INBOUND_ACT("DOWNLOAD_INBOUND_ACT"),
    
    DOWNLOAD_DISCREPANCY_ACT("DOWNLOAD_DISCREPANCY_ACT"),
    
    CHANGE_PALLETS_COUNT("CHANGE_PALLETS_COUNT")

    private final String value

    ShipmentActionType(String value) {
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
