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
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */

/**
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */
public enum FeedbackCommentAuthorType {
    
        USER("USER"),
        
        SHOP("SHOP");

private String value;

FeedbackCommentAuthorType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static FeedbackCommentAuthorType fromValue(String text) {
for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


