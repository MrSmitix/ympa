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
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 */

/**
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 */
public enum OrderDocumentStatusType {
    
        READY("READY"),
        
        NOT_READY("NOT_READY");

private String value;

OrderDocumentStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderDocumentStatusType fromValue(String text) {
for (OrderDocumentStatusType b : OrderDocumentStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


