package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderDeliveryEacType {

    @JsonProperty("MERCHANT_TO_COURIER") MERCHANT_TO_COURIER(String.valueOf("MERCHANT_TO_COURIER")), @JsonProperty("COURIER_TO_MERCHANT") COURIER_TO_MERCHANT(String.valueOf("COURIER_TO_MERCHANT")), @JsonProperty("CHECKING_BY_MERCHANT") CHECKING_BY_MERCHANT(String.valueOf("CHECKING_BY_MERCHANT"));


    private String value;

    OrderDeliveryEacType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderDeliveryEacType fromValue(String value) {
        for (OrderDeliveryEacType b : OrderDeliveryEacType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



