package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Логистический статус конкретного товара.
 */

public enum ReturnInstanceStatusType {

    CREATED("CREATED"),
    RECEIVED("RECEIVED"),
    IN_TRANSIT("IN_TRANSIT"),
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    PICKED("PICKED"),
    RECEIVED_ON_FULFILLMENT("RECEIVED_ON_FULFILLMENT"),
    CANCELLED("CANCELLED"),
    LOST("LOST"),
    UTILIZED("UTILIZED"),
    PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
    EXPROPRIATED("EXPROPRIATED"),
    NOT_IN_DEMAND("NOT_IN_DEMAND");

    private String value;

    ReturnInstanceStatusType(String value) {
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
    public static ReturnInstanceStatusType fromValue(String text) {
        for (ReturnInstanceStatusType b : ReturnInstanceStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

