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
 * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 */

/**
 * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 */
public enum OutletStatusType {
    
        AT_MODERATION("AT_MODERATION"),
        
        FAILED("FAILED"),
        
        MODERATED("MODERATED"),
        
        NONMODERATED("NONMODERATED"),
        
        UNKNOWN("UNKNOWN");

private String value;

OutletStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OutletStatusType fromValue(String text) {
for (OutletStatusType b : OutletStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


