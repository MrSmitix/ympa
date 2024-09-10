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
 * Причина обновления состава заказа.
 */

/**
 * Причина обновления состава заказа.
 */
public enum OrderItemsModificationRequestReasonType {
    
        PARTNER_REQUESTED_REMOVE("PARTNER_REQUESTED_REMOVE"),
        
        USER_REQUESTED_REMOVE("USER_REQUESTED_REMOVE");

private String value;

OrderItemsModificationRequestReasonType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderItemsModificationRequestReasonType fromValue(String text) {
for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


