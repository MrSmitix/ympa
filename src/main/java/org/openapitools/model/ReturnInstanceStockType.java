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
 * Тип остатка на складе.
 */

/**
 * Тип остатка на складе.
 */
public enum ReturnInstanceStockType {
    
        FIT("FIT"),
        
        DEFECT("DEFECT"),
        
        ANOMALY("ANOMALY"),
        
        SURPLUS("SURPLUS"),
        
        EXPIRED("EXPIRED"),
        
        MISGRADING("MISGRADING"),
        
        UNDEFINED("UNDEFINED"),
        
        INCORRECT_IMEI("INCORRECT_IMEI"),
        
        INCORRECT_SERIAL_NUMBER("INCORRECT_SERIAL_NUMBER"),
        
        INCORRECT_CIS("INCORRECT_CIS"),
        
        PART_MISSING("PART_MISSING"),
        
        NON_COMPLIENT("NON_COMPLIENT"),
        
        NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
        
        SERVICE("SERVICE"),
        
        MARKDOWN("MARKDOWN"),
        
        DEMO("DEMO"),
        
        REPAIR("REPAIR"),
        
        FIRMWARE("FIRMWARE"),
        
        UNKNOWN("UNKNOWN");

private String value;

ReturnInstanceStockType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ReturnInstanceStockType fromValue(String text) {
for (ReturnInstanceStockType b : ReturnInstanceStockType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


