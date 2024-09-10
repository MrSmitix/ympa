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
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */

/**
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */
public enum FeedbackStateType {
    
        LAST("LAST"),
        
        PREVIOUS("PREVIOUS"),
        
        DELETED("DELETED");

private String value;

FeedbackStateType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static FeedbackStateType fromValue(String text) {
for (FeedbackStateType b : FeedbackStateType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


