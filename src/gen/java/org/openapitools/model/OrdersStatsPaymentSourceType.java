package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsPaymentSourceType {

    @JsonProperty("BUYER") BUYER(String.valueOf("BUYER")), @JsonProperty("CASHBACK") CASHBACK(String.valueOf("CASHBACK")), @JsonProperty("MARKETPLACE") MARKETPLACE(String.valueOf("MARKETPLACE")), @JsonProperty("SPLIT") SPLIT(String.valueOf("SPLIT"));


    private String value;

    OrdersStatsPaymentSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsPaymentSourceType fromValue(String value) {
        for (OrdersStatsPaymentSourceType b : OrdersStatsPaymentSourceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



