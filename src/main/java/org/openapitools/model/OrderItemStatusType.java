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
 * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 */

/**
 * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 */
public enum OrderItemStatusType {
    
        REJECTED("REJECTED"),
        
        RETURNED("RETURNED");

private String value;

OrderItemStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderItemStatusType fromValue(String text) {
for (OrderItemStatusType b : OrderItemStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


