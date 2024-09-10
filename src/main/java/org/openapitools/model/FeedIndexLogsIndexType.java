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
 * Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
 */

/**
 * Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
 */
public enum FeedIndexLogsIndexType {
    
        DIFF("DIFF"),
        
        FAST_PRICE("FAST_PRICE"),
        
        FULL("FULL");

private String value;

FeedIndexLogsIndexType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static FeedIndexLogsIndexType fromValue(String text) {
for (FeedIndexLogsIndexType b : FeedIndexLogsIndexType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


