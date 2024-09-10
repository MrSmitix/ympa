package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
 */

public enum OrdersStatsOrderPaymentType {

    CREDIT("CREDIT"),
    POSTPAID("POSTPAID"),
    PREPAID("PREPAID"),
    TINKOFF_CREDIT("TINKOFF_CREDIT");

    private String value;

    OrdersStatsOrderPaymentType(String value) {
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
    public static OrdersStatsOrderPaymentType fromValue(String text) {
        for (OrdersStatsOrderPaymentType b : OrdersStatsOrderPaymentType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

