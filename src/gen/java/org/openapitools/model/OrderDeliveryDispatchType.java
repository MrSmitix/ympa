package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ отгрузки:  * &#x60;BUYER&#x60; — доставка покупателю.  * &#x60;MARKET_PARTNER_OUTLET&#x60; — доставка в пункт выдачи партнера.  * &#x60;MARKET_BRANDED_OUTLET&#x60; — доставка в пункт выдачи заказов Маркета.  * &#x60;SHOP_OUTLET&#x60; — доставка в пункт выдачи заказов магазина.  * &#x60;DROPOFF&#x60; — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderDeliveryDispatchType {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("BUYER") BUYER(String.valueOf("BUYER")), @JsonProperty("MARKET_PARTNER_OUTLET") MARKET_PARTNER_OUTLET(String.valueOf("MARKET_PARTNER_OUTLET")), @JsonProperty("MARKET_BRANDED_OUTLET") MARKET_BRANDED_OUTLET(String.valueOf("MARKET_BRANDED_OUTLET")), @JsonProperty("SHOP_OUTLET") SHOP_OUTLET(String.valueOf("SHOP_OUTLET")), @JsonProperty("DROPOFF") DROPOFF(String.valueOf("DROPOFF"));


    private String value;

    OrderDeliveryDispatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderDeliveryDispatchType fromValue(String value) {
        for (OrderDeliveryDispatchType b : OrderDeliveryDispatchType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



