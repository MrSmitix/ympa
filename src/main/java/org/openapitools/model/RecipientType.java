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
 * Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
 */

/**
 * Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
 */
public enum RecipientType {
    
        SHOP("SHOP"),
        
        DELIVERY_SERVICE("DELIVERY_SERVICE"),
        
        POST("POST");

private String value;

RecipientType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static RecipientType fromValue(String text) {
for (RecipientType b : RecipientType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


