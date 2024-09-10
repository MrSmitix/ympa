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
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 */

/**
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 */
public enum GoodsFeedbackCommentAuthorType {
    
        USER("USER"),
        
        BUSINESS("BUSINESS");

private String value;

GoodsFeedbackCommentAuthorType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static GoodsFeedbackCommentAuthorType fromValue(String text) {
for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


