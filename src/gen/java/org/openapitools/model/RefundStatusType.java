package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Cтатус возврата денег:  * &#x60;STARTED_BY_USER&#x60; — создан клиентом из личного кабинета.  * &#x60;REFUND_IN_PROGRESS&#x60; — ждет решение о возврате денег.  * &#x60;REFUNDED&#x60; — по возврату проведены все возвратные денежные транзакции.  * &#x60;FAILED&#x60; — невозможно провести возврат покупателю.  * &#x60;WAITING_FOR_DECISION&#x60; — ожидает решения.  * &#x60;DECISION_MADE&#x60; — по возврату принято решение.  * &#x60;REFUNDED_WITH_BONUSES&#x60; — возврат осуществлен баллами Плюса или промокодом.  * &#x60;REFUNDED_BY_SHOP&#x60; — магазин сделал самостоятельно возврат денег.  * &#x60;COMPLETE_WITHOUT_REFUND&#x60; — возврат денег не требуется.  * &#x60;CANCELLED&#x60; — возврат отменен. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum RefundStatusType {

    @JsonProperty("STARTED_BY_USER") STARTED_BY_USER(String.valueOf("STARTED_BY_USER")), @JsonProperty("REFUND_IN_PROGRESS") REFUND_IN_PROGRESS(String.valueOf("REFUND_IN_PROGRESS")), @JsonProperty("REFUNDED") REFUNDED(String.valueOf("REFUNDED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("WAITING_FOR_DECISION") WAITING_FOR_DECISION(String.valueOf("WAITING_FOR_DECISION")), @JsonProperty("DECISION_MADE") DECISION_MADE(String.valueOf("DECISION_MADE")), @JsonProperty("REFUNDED_WITH_BONUSES") REFUNDED_WITH_BONUSES(String.valueOf("REFUNDED_WITH_BONUSES")), @JsonProperty("REFUNDED_BY_SHOP") REFUNDED_BY_SHOP(String.valueOf("REFUNDED_BY_SHOP")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @JsonProperty("COMPLETE_WITHOUT_REFUND") COMPLETE_WITHOUT_REFUND(String.valueOf("COMPLETE_WITHOUT_REFUND")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    RefundStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RefundStatusType fromValue(String value) {
        for (RefundStatusType b : RefundStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



