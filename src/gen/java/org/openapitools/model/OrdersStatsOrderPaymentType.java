package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsOrderPaymentType {

    @JsonProperty("CREDIT") CREDIT(String.valueOf("CREDIT")), @JsonProperty("POSTPAID") POSTPAID(String.valueOf("POSTPAID")), @JsonProperty("PREPAID") PREPAID(String.valueOf("PREPAID")), @JsonProperty("TINKOFF_CREDIT") TINKOFF_CREDIT(String.valueOf("TINKOFF_CREDIT"));


    private String value;

    OrdersStatsOrderPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsOrderPaymentType fromValue(String value) {
        for (OrdersStatsOrderPaymentType b : OrdersStatsOrderPaymentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



