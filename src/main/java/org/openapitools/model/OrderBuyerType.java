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
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */

/**
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */
public enum OrderBuyerType {
    
        PERSON("PERSON"),
        
        BUSINESS("BUSINESS");

private String value;

OrderBuyerType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderBuyerType fromValue(String text) {
for (OrderBuyerType b : OrderBuyerType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


