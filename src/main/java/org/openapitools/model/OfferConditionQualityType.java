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
 * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 */

/**
 * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 */
public enum OfferConditionQualityType {
    
        PERFECT("PERFECT"),
        
        EXCELLENT("EXCELLENT"),
        
        GOOD("GOOD"),
        
        NOT_SPECIFIED("NOT_SPECIFIED");

private String value;

OfferConditionQualityType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OfferConditionQualityType fromValue(String text) {
for (OfferConditionQualityType b : OfferConditionQualityType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


