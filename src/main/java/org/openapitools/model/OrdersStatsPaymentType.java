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
 * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 */

/**
 * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 */
public enum OrdersStatsPaymentType {
    
        PAYMENT("PAYMENT"),
        
        REFUND("REFUND"),
        
        UNKNOWN("UNKNOWN");

private String value;

OrdersStatsPaymentType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrdersStatsPaymentType fromValue(String text) {
for (OrdersStatsPaymentType b : OrdersStatsPaymentType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


