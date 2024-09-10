package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Текущий статус заказа:  * &#x60;CANCELLED_BEFORE_PROCESSING&#x60; — заказ отменен до начала его обработки.  * &#x60;CANCELLED_IN_DELIVERY&#x60; — заказ отменен во время его доставки.  * &#x60;CANCELLED_IN_PROCESSING&#x60; — заказ отменен во время его обработки.  * &#x60;DELIVERY&#x60; — заказ передан службе доставки.  * &#x60;DELIVERED&#x60; — заказ доставлен.  * &#x60;PARTIALLY_DELIVERED&#x60; — заказ частично доставлен.  * &#x60;PARTIALLY_RETURNED&#x60; — заказ частично возвращен покупателем.  * &#x60;PENDING&#x60; — заказ ожидает подтверждения.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт выдачи.  * &#x60;PROCESSING&#x60; — заказ в обработке.  * &#x60;RESERVED&#x60; — товар зарезервирован на складе.  * &#x60;RETURNED&#x60; — заказ полностью возвращен покупателем.  * &#x60;UNKNOWN&#x60; — неизвестный статус заказа.  * &#x60;UNPAID&#x60; — заказ от юридического лица ожидает оплаты.  * &#x60;LOST&#x60; — заказ утерян. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderStatsStatusType {

    @JsonProperty("CANCELLED_BEFORE_PROCESSING") CANCELLED_BEFORE_PROCESSING(String.valueOf("CANCELLED_BEFORE_PROCESSING")), @JsonProperty("CANCELLED_IN_DELIVERY") CANCELLED_IN_DELIVERY(String.valueOf("CANCELLED_IN_DELIVERY")), @JsonProperty("CANCELLED_IN_PROCESSING") CANCELLED_IN_PROCESSING(String.valueOf("CANCELLED_IN_PROCESSING")), @JsonProperty("DELIVERY") DELIVERY(String.valueOf("DELIVERY")), @JsonProperty("DELIVERED") DELIVERED(String.valueOf("DELIVERED")), @JsonProperty("PARTIALLY_DELIVERED") PARTIALLY_DELIVERED(String.valueOf("PARTIALLY_DELIVERED")), @JsonProperty("PARTIALLY_RETURNED") PARTIALLY_RETURNED(String.valueOf("PARTIALLY_RETURNED")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("PICKUP") PICKUP(String.valueOf("PICKUP")), @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("RESERVED") RESERVED(String.valueOf("RESERVED")), @JsonProperty("RETURNED") RETURNED(String.valueOf("RETURNED")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("UNPAID") UNPAID(String.valueOf("UNPAID")), @JsonProperty("LOST") LOST(String.valueOf("LOST"));


    private String value;

    OrderStatsStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderStatsStatusType fromValue(String value) {
        for (OrderStatsStatusType b : OrderStatsStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



