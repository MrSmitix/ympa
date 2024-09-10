package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
 */

public enum FieldStateType {

    SPECIFIED("SPECIFIED"),
    EMPTY("EMPTY");

    private String value;

    FieldStateType(String value) {
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
    public static FieldStateType fromValue(String text) {
        for (FieldStateType b : FieldStateType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

