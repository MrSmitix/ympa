package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnDecisionReasonType {

    BAD_QUALITY("BAD_QUALITY"),
    
    DOES_NOT_FIT("DOES_NOT_FIT"),
    
    WRONG_ITEM("WRONG_ITEM"),
    
    DAMAGE_DELIVERY("DAMAGE_DELIVERY"),
    
    LOYALTY_FAIL("LOYALTY_FAIL"),
    
    CONTENT_FAIL("CONTENT_FAIL"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    ReturnDecisionReasonType(String value) {
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
