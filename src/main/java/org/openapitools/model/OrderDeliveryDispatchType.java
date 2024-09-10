/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
 */

/**
 * Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
 */
public enum OrderDeliveryDispatchType {
    
        UNKNOWN("UNKNOWN"),
        
        BUYER("BUYER"),
        
        MARKET_PARTNER_OUTLET("MARKET_PARTNER_OUTLET"),
        
        MARKET_BRANDED_OUTLET("MARKET_BRANDED_OUTLET"),
        
        SHOP_OUTLET("SHOP_OUTLET"),
        
        DROPOFF("DROPOFF");

private String value;

OrderDeliveryDispatchType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderDeliveryDispatchType fromValue(String text) {
for (OrderDeliveryDispatchType b : OrderDeliveryDispatchType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


