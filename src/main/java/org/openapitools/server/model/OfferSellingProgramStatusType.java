package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 */

public enum OfferSellingProgramStatusType {

    FINE("FINE"),
    REJECT("REJECT");

    private String value;

    OfferSellingProgramStatusType(String value) {
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
    public static OfferSellingProgramStatusType fromValue(String text) {
        for (OfferSellingProgramStatusType b : OfferSellingProgramStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

