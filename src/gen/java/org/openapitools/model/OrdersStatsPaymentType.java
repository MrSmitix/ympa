package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsPaymentType {

    @JsonProperty("PAYMENT") PAYMENT(String.valueOf("PAYMENT")), @JsonProperty("REFUND") REFUND(String.valueOf("REFUND")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrdersStatsPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsPaymentType fromValue(String value) {
        for (OrdersStatsPaymentType b : OrdersStatsPaymentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



