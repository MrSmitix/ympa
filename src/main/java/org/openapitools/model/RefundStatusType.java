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
 * Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
 */

/**
 * Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
 */
public enum RefundStatusType {
    
        STARTED_BY_USER("STARTED_BY_USER"),
        
        REFUND_IN_PROGRESS("REFUND_IN_PROGRESS"),
        
        REFUNDED("REFUNDED"),
        
        FAILED("FAILED"),
        
        WAITING_FOR_DECISION("WAITING_FOR_DECISION"),
        
        DECISION_MADE("DECISION_MADE"),
        
        REFUNDED_WITH_BONUSES("REFUNDED_WITH_BONUSES"),
        
        REFUNDED_BY_SHOP("REFUNDED_BY_SHOP"),
        
        CANCELLED("CANCELLED"),
        
        COMPLETE_WITHOUT_REFUND("COMPLETE_WITHOUT_REFUND"),
        
        UNKNOWN("UNKNOWN");

private String value;

RefundStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static RefundStatusType fromValue(String text) {
for (RefundStatusType b : RefundStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


