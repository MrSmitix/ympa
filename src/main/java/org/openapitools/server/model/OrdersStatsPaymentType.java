package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 */

public enum OrdersStatsPaymentType {

    PAYMENT("PAYMENT"),
    REFUND("REFUND"),
    UNKNOWN("UNKNOWN");

    private String value;

    OrdersStatsPaymentType(String value) {
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
    public static OrdersStatsPaymentType fromValue(String text) {
        for (OrdersStatsPaymentType b : OrdersStatsPaymentType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

