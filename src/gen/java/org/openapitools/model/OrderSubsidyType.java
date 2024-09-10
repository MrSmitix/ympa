package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderSubsidyType {

    @JsonProperty("YANDEX_CASHBACK") YANDEX_CASHBACK(String.valueOf("YANDEX_CASHBACK")), @JsonProperty("SUBSIDY") SUBSIDY(String.valueOf("SUBSIDY")), @JsonProperty("DELIVERY") DELIVERY(String.valueOf("DELIVERY"));


    private String value;

    OrderSubsidyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderSubsidyType fromValue(String value) {
        for (OrderSubsidyType b : OrderSubsidyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



