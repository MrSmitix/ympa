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
 * Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
 */

/**
 * Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
 */
public enum SortOrderType {
    
        ASC("ASC"),
        
        DESC("DESC");

private String value;

SortOrderType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static SortOrderType fromValue(String text) {
for (SortOrderType b : SortOrderType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


