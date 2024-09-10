package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AffectedOrderQualityRatingComponentType {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
    
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
    
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
    
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE")

    private final String value

    AffectedOrderQualityRatingComponentType(String value) {
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
