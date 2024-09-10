package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnInstanceStockType {

    FIT("FIT"),
    
    DEFECT("DEFECT"),
    
    ANOMALY("ANOMALY"),
    
    SURPLUS("SURPLUS"),
    
    EXPIRED("EXPIRED"),
    
    MISGRADING("MISGRADING"),
    
    UNDEFINED("UNDEFINED"),
    
    INCORRECT_IMEI("INCORRECT_IMEI"),
    
    INCORRECT_SERIAL_NUMBER("INCORRECT_SERIAL_NUMBER"),
    
    INCORRECT_CIS("INCORRECT_CIS"),
    
    PART_MISSING("PART_MISSING"),
    
    NON_COMPLIENT("NON_COMPLIENT"),
    
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
    
    SERVICE("SERVICE"),
    
    MARKDOWN("MARKDOWN"),
    
    DEMO("DEMO"),
    
    REPAIR("REPAIR"),
    
    FIRMWARE("FIRMWARE"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    ReturnInstanceStockType(String value) {
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
