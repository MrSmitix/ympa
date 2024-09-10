package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
 */

public enum PriceQuarantineVerdictParamNameType {

    CURRENT_PRICE("CURRENT_PRICE"),
    LAST_VALID_PRICE("LAST_VALID_PRICE"),
    MIN_PRICE("MIN_PRICE"),
    CURRENCY("CURRENCY");

    private String value;

    PriceQuarantineVerdictParamNameType(String value) {
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
    public static PriceQuarantineVerdictParamNameType fromValue(String text) {
        for (PriceQuarantineVerdictParamNameType b : PriceQuarantineVerdictParamNameType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

