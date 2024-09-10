package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderStatusType {

    @JsonProperty("PLACING") PLACING(String.valueOf("PLACING")), @JsonProperty("RESERVED") RESERVED(String.valueOf("RESERVED")), @JsonProperty("UNPAID") UNPAID(String.valueOf("UNPAID")), @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("DELIVERY") DELIVERY(String.valueOf("DELIVERY")), @JsonProperty("PICKUP") PICKUP(String.valueOf("PICKUP")), @JsonProperty("DELIVERED") DELIVERED(String.valueOf("DELIVERED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("PARTIALLY_RETURNED") PARTIALLY_RETURNED(String.valueOf("PARTIALLY_RETURNED")), @JsonProperty("RETURNED") RETURNED(String.valueOf("RETURNED")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderStatusType fromValue(String value) {
        for (OrderStatusType b : OrderStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



