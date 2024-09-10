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
 * Решение по возврату.
 */

/**
 * Решение по возврату.
 */
public enum ReturnRequestDecisionType {
    
        REFUND_MONEY("REFUND_MONEY"),
        
        REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
        
        REPAIR("REPAIR"),
        
        REPLACE("REPLACE"),
        
        SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
        
        DECLINE_REFUND("DECLINE_REFUND"),
        
        OTHER_DECISION("OTHER_DECISION");

private String value;

ReturnRequestDecisionType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ReturnRequestDecisionType fromValue(String text) {
for (ReturnRequestDecisionType b : ReturnRequestDecisionType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


