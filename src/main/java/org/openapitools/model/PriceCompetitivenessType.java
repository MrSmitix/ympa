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
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 */

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 */
public enum PriceCompetitivenessType {
    
        OPTIMAL("OPTIMAL"),
        
        AVERAGE("AVERAGE"),
        
        LOW("LOW");

private String value;

PriceCompetitivenessType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PriceCompetitivenessType fromValue(String text) {
for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


