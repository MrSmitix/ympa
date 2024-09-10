package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Причина обновления состава заказа.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderItemsModificationRequestReasonType {

    @JsonProperty("PARTNER_REQUESTED_REMOVE") PARTNER_REQUESTED_REMOVE(String.valueOf("PARTNER_REQUESTED_REMOVE")), @JsonProperty("USER_REQUESTED_REMOVE") USER_REQUESTED_REMOVE(String.valueOf("USER_REQUESTED_REMOVE"));


    private String value;

    OrderItemsModificationRequestReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderItemsModificationRequestReasonType fromValue(String value) {
        for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



