package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. 
 */

public enum PriceQuarantineVerdictType {

    PRICE_CHANGE("PRICE_CHANGE"),
    LOW_PRICE("LOW_PRICE"),
    LOW_PRICE_PROMO("LOW_PRICE_PROMO");

    private String value;

    PriceQuarantineVerdictType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PriceQuarantineVerdictType fromValue(String text) {
        for (PriceQuarantineVerdictType b : PriceQuarantineVerdictType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

