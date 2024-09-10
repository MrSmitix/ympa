package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderCancellationReasonType {

    @JsonProperty("ORDER_DELIVERED") DELIVERED(String.valueOf("ORDER_DELIVERED")), @JsonProperty("ORDER_IN_DELIVERY") IN_DELIVERY(String.valueOf("ORDER_IN_DELIVERY"));


    private String value;

    OrderCancellationReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderCancellationReasonType fromValue(String value) {
        for (OrderCancellationReasonType b : OrderCancellationReasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



