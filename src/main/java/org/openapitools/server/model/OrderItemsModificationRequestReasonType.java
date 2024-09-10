package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Причина обновления состава заказа.
 */

public enum OrderItemsModificationRequestReasonType {

    PARTNER_REQUESTED_REMOVE("PARTNER_REQUESTED_REMOVE"),
    USER_REQUESTED_REMOVE("USER_REQUESTED_REMOVE");

    private String value;

    OrderItemsModificationRequestReasonType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OrderItemsModificationRequestReasonType fromValue(String text) {
        for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

