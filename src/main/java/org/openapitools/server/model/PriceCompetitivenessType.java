package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 */

public enum PriceCompetitivenessType {

    OPTIMAL("OPTIMAL"),
    AVERAGE("AVERAGE"),
    LOW("LOW");

    private String value;

    PriceCompetitivenessType(String value) {
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
    public static PriceCompetitivenessType fromValue(String text) {
        for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

