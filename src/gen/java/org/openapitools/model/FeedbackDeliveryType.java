package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedbackDeliveryType {

    @JsonProperty("DELIVERY") DELIVERY(String.valueOf("DELIVERY")), @JsonProperty("PICKUP") PICKUP(String.valueOf("PICKUP")), @JsonProperty("INSTORE") INSTORE(String.valueOf("INSTORE"));


    private String value;

    FeedbackDeliveryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedbackDeliveryType fromValue(String value) {
        for (FeedbackDeliveryType b : FeedbackDeliveryType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



