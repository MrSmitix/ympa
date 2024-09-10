package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DayOfWeekType {

    MONDAY("MONDAY"),
    
    TUESDAY("TUESDAY"),
    
    WEDNESDAY("WEDNESDAY"),
    
    THURSDAY("THURSDAY"),
    
    FRIDAY("FRIDAY"),
    
    SATURDAY("SATURDAY"),
    
    SUNDAY("SUNDAY")

    private final String value

    DayOfWeekType(String value) {
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
