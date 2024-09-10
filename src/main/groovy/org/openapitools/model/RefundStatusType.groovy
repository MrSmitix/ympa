package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RefundStatusType {

    STARTED_BY_USER("STARTED_BY_USER"),
    
    REFUND_IN_PROGRESS("REFUND_IN_PROGRESS"),
    
    REFUNDED("REFUNDED"),
    
    FAILED("FAILED"),
    
    WAITING_FOR_DECISION("WAITING_FOR_DECISION"),
    
    DECISION_MADE("DECISION_MADE"),
    
    REFUNDED_WITH_BONUSES("REFUNDED_WITH_BONUSES"),
    
    REFUNDED_BY_SHOP("REFUNDED_BY_SHOP"),
    
    CANCELLED("CANCELLED"),
    
    COMPLETE_WITHOUT_REFUND("COMPLETE_WITHOUT_REFUND"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    RefundStatusType(String value) {
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
