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
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 */

/**
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 */
public enum AgeUnitType {
    
        YEAR("YEAR"),
        
        MONTH("MONTH");

private String value;

AgeUnitType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AgeUnitType fromValue(String text) {
for (AgeUnitType b : AgeUnitType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


