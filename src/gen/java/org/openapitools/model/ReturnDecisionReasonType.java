package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Причины возврата:  * &#x60;BAD_QUALITY&#x60; — бракованный товар (есть недостатки).  * &#x60;DO_NOT_FIT&#x60; — товар не подошел.  * &#x60;WRONG_ITEM&#x60; — привезли не тот товар.  * &#x60;DAMAGE_DELIVERY&#x60; — товар поврежден при доставке.  * &#x60;LOYALTY_FAIL&#x60; — невозможно установить виновного в браке/пересорте.  * &#x60;CONTENT_FAIL&#x60; — ошибочное описание товара по вине Маркета.  * &#x60;UNKNOWN&#x60; — причина не известна. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnDecisionReasonType {

    @JsonProperty("BAD_QUALITY") BAD_QUALITY(String.valueOf("BAD_QUALITY")), @JsonProperty("DOES_NOT_FIT") DOES_NOT_FIT(String.valueOf("DOES_NOT_FIT")), @JsonProperty("WRONG_ITEM") WRONG_ITEM(String.valueOf("WRONG_ITEM")), @JsonProperty("DAMAGE_DELIVERY") DAMAGE_DELIVERY(String.valueOf("DAMAGE_DELIVERY")), @JsonProperty("LOYALTY_FAIL") LOYALTY_FAIL(String.valueOf("LOYALTY_FAIL")), @JsonProperty("CONTENT_FAIL") CONTENT_FAIL(String.valueOf("CONTENT_FAIL")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    ReturnDecisionReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnDecisionReasonType fromValue(String value) {
        for (ReturnDecisionReasonType b : ReturnDecisionReasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



