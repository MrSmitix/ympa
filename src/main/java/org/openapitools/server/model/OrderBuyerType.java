package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */

public enum OrderBuyerType {

    PERSON("PERSON"),
    BUSINESS("BUSINESS");

    private String value;

    OrderBuyerType(String value) {
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
    public static OrderBuyerType fromValue(String text) {
        for (OrderBuyerType b : OrderBuyerType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

