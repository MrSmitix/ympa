package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderDeliveryType {

    @JsonProperty("DELIVERY") DELIVERY(String.valueOf("DELIVERY")), @JsonProperty("PICKUP") PICKUP(String.valueOf("PICKUP")), @JsonProperty("POST") POST(String.valueOf("POST")), @JsonProperty("DIGITAL") DIGITAL(String.valueOf("DIGITAL")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderDeliveryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderDeliveryType fromValue(String value) {
        for (OrderDeliveryType b : OrderDeliveryType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



