package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
 */

public enum OrderUpdateStatusType {

    OK("OK"),
    ERROR("ERROR");

    private String value;

    OrderUpdateStatusType(String value) {
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
    public static OrderUpdateStatusType fromValue(String text) {
        for (OrderUpdateStatusType b : OrderUpdateStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

