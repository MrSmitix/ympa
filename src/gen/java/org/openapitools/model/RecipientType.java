package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ возврата товара покупателем:  * &#x60;SHOP&#x60; — в точку возврата магазина.  * &#x60;DELIVERY_SERVICE&#x60; — отправить курьером.  * &#x60;POST&#x60; — почта. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum RecipientType {

    @JsonProperty("SHOP") SHOP(String.valueOf("SHOP")), @JsonProperty("DELIVERY_SERVICE") DELIVERY_SERVICE(String.valueOf("DELIVERY_SERVICE")), @JsonProperty("POST") POST(String.valueOf("POST"));


    private String value;

    RecipientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RecipientType fromValue(String value) {
        for (RecipientType b : RecipientType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



