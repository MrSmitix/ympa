package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Решение по возврату.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnRequestDecisionType {

    @JsonProperty("REFUND_MONEY") REFUND_MONEY(String.valueOf("REFUND_MONEY")), @JsonProperty("REFUND_MONEY_INCLUDING_SHIPMENT") REFUND_MONEY_INCLUDING_SHIPMENT(String.valueOf("REFUND_MONEY_INCLUDING_SHIPMENT")), @JsonProperty("REPAIR") REPAIR(String.valueOf("REPAIR")), @JsonProperty("REPLACE") REPLACE(String.valueOf("REPLACE")), @JsonProperty("SEND_TO_EXAMINATION") SEND_TO_EXAMINATION(String.valueOf("SEND_TO_EXAMINATION")), @JsonProperty("DECLINE_REFUND") DECLINE_REFUND(String.valueOf("DECLINE_REFUND")), @JsonProperty("OTHER_DECISION") OTHER_DECISION(String.valueOf("OTHER_DECISION"));


    private String value;

    ReturnRequestDecisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnRequestDecisionType fromValue(String value) {
        for (ReturnRequestDecisionType b : ReturnRequestDecisionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



