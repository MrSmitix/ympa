package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
 */

public enum OrderItemSubsidyType {

    YANDEX_CASHBACK("YANDEX_CASHBACK"),
    SUBSIDY("SUBSIDY");

    private String value;

    OrderItemSubsidyType(String value) {
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
    public static OrderItemSubsidyType fromValue(String text) {
        for (OrderItemSubsidyType b : OrderItemSubsidyType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

