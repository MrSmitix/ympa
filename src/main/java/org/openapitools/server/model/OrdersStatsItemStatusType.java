package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
 */

public enum OrdersStatsItemStatusType {

    REJECTED("REJECTED"),
    RETURNED("RETURNED");

    private String value;

    OrdersStatsItemStatusType(String value) {
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
    public static OrdersStatsItemStatusType fromValue(String text) {
        for (OrdersStatsItemStatusType b : OrdersStatsItemStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

