package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Причина переноса доставки заказа. Возможные причины изменения даты:   - &#x60;&#x60;&#x60;USER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - &#x60;&#x60;&#x60;PARTNER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — магазин не может доставить заказ в срок. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderDeliveryDateReasonType {

    @JsonProperty("USER_MOVED_DELIVERY_DATES") USER_MOVED_DELIVERY_DATES(String.valueOf("USER_MOVED_DELIVERY_DATES")), @JsonProperty("PARTNER_MOVED_DELIVERY_DATES") PARTNER_MOVED_DELIVERY_DATES(String.valueOf("PARTNER_MOVED_DELIVERY_DATES"));


    private String value;

    OrderDeliveryDateReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderDeliveryDateReasonType fromValue(String value) {
        for (OrderDeliveryDateReasonType b : OrderDeliveryDateReasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



