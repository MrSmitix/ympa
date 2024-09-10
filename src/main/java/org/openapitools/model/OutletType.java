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
 * Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
 */

/**
 * Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
 */
public enum OutletType {
    
        DEPOT("DEPOT"),
        
        MIXED("MIXED"),
        
        RETAIL("RETAIL"),
        
        NOT_DEFINED("NOT_DEFINED");

private String value;

OutletType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OutletType fromValue(String text) {
for (OutletType b : OutletType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


