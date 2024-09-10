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
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 */

/**
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 */
public enum GoodsFeedbackCommentStatusType {
    
        PUBLISHED("PUBLISHED"),
        
        UNMODERATED("UNMODERATED"),
        
        BANNED("BANNED"),
        
        DELETED("DELETED");

private String value;

GoodsFeedbackCommentStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static GoodsFeedbackCommentStatusType fromValue(String text) {
for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


