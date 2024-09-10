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
 * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 */

/**
 * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 */
public enum RejectedPromoOfferDeleteReasonType {
    
        OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

private String value;

RejectedPromoOfferDeleteReasonType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static RejectedPromoOfferDeleteReasonType fromValue(String text) {
for (RejectedPromoOfferDeleteReasonType b : RejectedPromoOfferDeleteReasonType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


