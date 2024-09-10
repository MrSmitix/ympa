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
 * Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
 */

/**
 * Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
 */
public enum ReturnShipmentStatusType {
    
        CREATED("CREATED"),
        
        RECEIVED("RECEIVED"),
        
        IN_TRANSIT("IN_TRANSIT"),
        
        READY_FOR_PICKUP("READY_FOR_PICKUP"),
        
        PICKED("PICKED"),
        
        LOST("LOST"),
        
        EXPIRED("EXPIRED"),
        
        CANCELLED("CANCELLED"),
        
        FULFILMENT_RECEIVED("FULFILMENT_RECEIVED"),
        
        PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
        
        NOT_IN_DEMAND("NOT_IN_DEMAND"),
        
        UTILIZED("UTILIZED"),
        
        READY_FOR_EXPROPRIATION("READY_FOR_EXPROPRIATION"),
        
        RECEIVED_FOR_EXPROPRIATION("RECEIVED_FOR_EXPROPRIATION");

private String value;

ReturnShipmentStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ReturnShipmentStatusType fromValue(String text) {
for (ReturnShipmentStatusType b : ReturnShipmentStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


