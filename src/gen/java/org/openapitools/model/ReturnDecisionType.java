package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnDecisionType {

    @JsonProperty("REFUND_MONEY") REFUND_MONEY(String.valueOf("REFUND_MONEY")), @JsonProperty("REFUND_MONEY_INCLUDING_SHIPMENT") REFUND_MONEY_INCLUDING_SHIPMENT(String.valueOf("REFUND_MONEY_INCLUDING_SHIPMENT")), @JsonProperty("REPAIR") REPAIR(String.valueOf("REPAIR")), @JsonProperty("REPLACE") REPLACE(String.valueOf("REPLACE")), @JsonProperty("SEND_TO_EXAMINATION") SEND_TO_EXAMINATION(String.valueOf("SEND_TO_EXAMINATION")), @JsonProperty("DECLINE_REFUND") DECLINE_REFUND(String.valueOf("DECLINE_REFUND")), @JsonProperty("OTHER_DECISION") OTHER_DECISION(String.valueOf("OTHER_DECISION")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    ReturnDecisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnDecisionType fromValue(String value) {
        for (ReturnDecisionType b : ReturnDecisionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



