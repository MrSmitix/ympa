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
 * Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
 */

/**
 * Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
 */
public enum OrdersStatsStockType {
    
        FIT("FIT"),
        
        FREEZE("FREEZE"),
        
        AVAILABLE("AVAILABLE"),
        
        QUARANTINE("QUARANTINE"),
        
        UTILIZATION("UTILIZATION"),
        
        DEFECT("DEFECT"),
        
        EXPIRED("EXPIRED");

private String value;

OrdersStatsStockType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrdersStatsStockType fromValue(String text) {
for (OrdersStatsStockType b : OrdersStatsStockType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


