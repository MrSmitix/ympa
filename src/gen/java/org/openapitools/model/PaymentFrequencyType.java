package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Частота выплат:  * &#x60;DAILY&#x60; — ежедневно. * &#x60;WEEKLY&#x60; — раз в неделю. * &#x60;BIWEEKLY&#x60; — раз в две недели. * &#x60;MONTHLY&#x60; — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PaymentFrequencyType {

    @JsonProperty("DAILY") DAILY(String.valueOf("DAILY")), @JsonProperty("WEEKLY") WEEKLY(String.valueOf("WEEKLY")), @JsonProperty("BIWEEKLY") BIWEEKLY(String.valueOf("BIWEEKLY")), @JsonProperty("MONTHLY") MONTHLY(String.valueOf("MONTHLY"));


    private String value;

    PaymentFrequencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentFrequencyType fromValue(String value) {
        for (PaymentFrequencyType b : PaymentFrequencyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



