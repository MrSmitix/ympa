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
 * Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 */

/**
 * Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 */
public enum OrderCancellationReasonType {
    
        DELIVERED("ORDER_DELIVERED"),
        
        IN_DELIVERY("ORDER_IN_DELIVERY");

private String value;

OrderCancellationReasonType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderCancellationReasonType fromValue(String text) {
for (OrderCancellationReasonType b : OrderCancellationReasonType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


