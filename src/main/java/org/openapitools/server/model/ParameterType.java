package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
 */

public enum ParameterType {

    TEXT("TEXT"),
    ENUM("ENUM"),
    BOOLEAN("BOOLEAN"),
    NUMERIC("NUMERIC");

    private String value;

    ParameterType(String value) {
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
    public static ParameterType fromValue(String text) {
        for (ParameterType b : ParameterType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

