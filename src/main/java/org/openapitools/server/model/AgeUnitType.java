package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 */

public enum AgeUnitType {

    YEAR("YEAR"),
    MONTH("MONTH");

    private String value;

    AgeUnitType(String value) {
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
    public static AgeUnitType fromValue(String text) {
        for (AgeUnitType b : AgeUnitType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

