package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnDecisionType {

    REFUND_MONEY("REFUND_MONEY"),
    
    REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
    
    REPAIR("REPAIR"),
    
    REPLACE("REPLACE"),
    
    SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
    
    DECLINE_REFUND("DECLINE_REFUND"),
    
    OTHER_DECISION("OTHER_DECISION"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    ReturnDecisionType(String value) {
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
