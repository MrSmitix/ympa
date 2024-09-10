package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderDeliveryPartnerType {

    @JsonProperty("SHOP") SHOP(String.valueOf("SHOP")), @JsonProperty("YANDEX_MARKET") YANDEX_MARKET(String.valueOf("YANDEX_MARKET")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderDeliveryPartnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderDeliveryPartnerType fromValue(String value) {
        for (OrderDeliveryPartnerType b : OrderDeliveryPartnerType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



