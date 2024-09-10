package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
 */

public enum OrderDeliveryDateReasonType {

    USER_MOVED_DELIVERY_DATES("USER_MOVED_DELIVERY_DATES"),
    PARTNER_MOVED_DELIVERY_DATES("PARTNER_MOVED_DELIVERY_DATES");

    private String value;

    OrderDeliveryDateReasonType(String value) {
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
    public static OrderDeliveryDateReasonType fromValue(String text) {
        for (OrderDeliveryDateReasonType b : OrderDeliveryDateReasonType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

