package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
 */

public enum TimeUnitType {

    HOUR("HOUR"),
    DAY("DAY"),
    WEEK("WEEK"),
    MONTH("MONTH"),
    YEAR("YEAR");

    private String value;

    TimeUnitType(String value) {
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
    public static TimeUnitType fromValue(String text) {
        for (TimeUnitType b : TimeUnitType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

