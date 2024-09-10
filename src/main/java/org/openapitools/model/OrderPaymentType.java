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
 * Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 */

/**
 * Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 */
public enum OrderPaymentType {
    
        PREPAID("PREPAID"),
        
        POSTPAID("POSTPAID"),
        
        UNKNOWN("UNKNOWN");

private String value;

OrderPaymentType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderPaymentType fromValue(String text) {
for (OrderPaymentType b : OrderPaymentType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


