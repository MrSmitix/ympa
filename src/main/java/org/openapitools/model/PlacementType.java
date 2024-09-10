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
 * Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
 */

/**
 * Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
 */
public enum PlacementType {
    
        FBS("FBS"),
        
        FBY("FBY"),
        
        DBS("DBS");

private String value;

PlacementType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PlacementType fromValue(String text) {
for (PlacementType b : PlacementType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


