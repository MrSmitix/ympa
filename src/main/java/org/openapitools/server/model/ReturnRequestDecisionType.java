package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Решение по возврату.
 */

public enum ReturnRequestDecisionType {

    REFUND_MONEY("REFUND_MONEY"),
    REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
    REPAIR("REPAIR"),
    REPLACE("REPLACE"),
    SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
    DECLINE_REFUND("DECLINE_REFUND"),
    OTHER_DECISION("OTHER_DECISION");

    private String value;

    ReturnRequestDecisionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnRequestDecisionType fromValue(String text) {
        for (ReturnRequestDecisionType b : ReturnRequestDecisionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

