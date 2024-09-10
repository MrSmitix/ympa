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
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */

/**
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */
public enum ShowsSalesGroupingType {
    
        CATEGORIES("CATEGORIES"),
        
        OFFERS("OFFERS");

private String value;

ShowsSalesGroupingType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ShowsSalesGroupingType fromValue(String text) {
for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


