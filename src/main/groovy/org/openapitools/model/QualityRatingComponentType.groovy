package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum QualityRatingComponentType {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
    
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
    
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
    
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE"),
    
    FBY_LATE_DELIVERY_RATE("FBY_LATE_DELIVERY_RATE"),
    
    FBY_CANCELLATION_RATE("FBY_CANCELLATION_RATE"),
    
    FBY_DELIVERY_DIFF_RATE("FBY_DELIVERY_DIFF_RATE"),
    
    FBY_LATE_EDITING_RATE("FBY_LATE_EDITING_RATE")

    private final String value

    QualityRatingComponentType(String value) {
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
