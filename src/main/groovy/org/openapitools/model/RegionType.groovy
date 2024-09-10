package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RegionType {

    OTHER("OTHER"),
    
    CONTINENT("CONTINENT"),
    
    REGION("REGION"),
    
    COUNTRY("COUNTRY"),
    
    COUNTRY_DISTRICT("COUNTRY_DISTRICT"),
    
    REPUBLIC("REPUBLIC"),
    
    CITY("CITY"),
    
    VILLAGE("VILLAGE"),
    
    CITY_DISTRICT("CITY_DISTRICT"),
    
    SUBWAY_STATION("SUBWAY_STATION"),
    
    REPUBLIC_AREA("REPUBLIC_AREA")

    private final String value

    RegionType(String value) {
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
