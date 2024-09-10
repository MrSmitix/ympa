package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 */

public enum OrderItemStatusType {

    REJECTED("REJECTED"),
    RETURNED("RETURNED");

    private String value;

    OrderItemStatusType(String value) {
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
    public static OrderItemStatusType fromValue(String text) {
        for (OrderItemStatusType b : OrderItemStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

