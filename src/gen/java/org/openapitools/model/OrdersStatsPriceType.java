package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsPriceType {

    @JsonProperty("BUYER") BUYER(String.valueOf("BUYER")), @JsonProperty("CASHBACK") CASHBACK(String.valueOf("CASHBACK")), @JsonProperty("MARKETPLACE") MARKETPLACE(String.valueOf("MARKETPLACE"));


    private String value;

    OrdersStatsPriceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsPriceType fromValue(String value) {
        for (OrdersStatsPriceType b : OrdersStatsPriceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



