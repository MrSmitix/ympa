package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
 */

public enum DayOfWeekType {

    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");

    private String value;

    DayOfWeekType(String value) {
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
    public static DayOfWeekType fromValue(String text) {
        for (DayOfWeekType b : DayOfWeekType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

