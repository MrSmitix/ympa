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
 * Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 */

/**
 * Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 */
public enum AddOffersToArchiveErrorType {
    
        OFFER_HAS_STOCKS("OFFER_HAS_STOCKS"),
        
        UNKNOWN("UNKNOWN");

private String value;

AddOffersToArchiveErrorType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AddOffersToArchiveErrorType fromValue(String text) {
for (AddOffersToArchiveErrorType b : AddOffersToArchiveErrorType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


