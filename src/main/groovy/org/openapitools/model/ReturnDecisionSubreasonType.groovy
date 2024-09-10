package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnDecisionSubreasonType {

    USER_DID_NOT_LIKE("USER_DID_NOT_LIKE"),
    
    USER_CHANGED_MIND("USER_CHANGED_MIND"),
    
    DELIVERED_TOO_LONG("DELIVERED_TOO_LONG"),
    
    BAD_PACKAGE("BAD_PACKAGE"),
    
    DAMAGED("DAMAGED"),
    
    NOT_WORKING("NOT_WORKING"),
    
    INCOMPLETENESS("INCOMPLETENESS"),
    
    WRONG_ITEM("WRONG_ITEM"),
    
    WRONG_COLOR("WRONG_COLOR"),
    
    DID_NOT_MATCH_DESCRIPTION("DID_NOT_MATCH_DESCRIPTION"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    ReturnDecisionSubreasonType(String value) {
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
