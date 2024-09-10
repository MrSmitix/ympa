package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип остатка на складе.
 */

public enum ReturnInstanceStockType {

    FIT("FIT"),
    DEFECT("DEFECT"),
    ANOMALY("ANOMALY"),
    SURPLUS("SURPLUS"),
    EXPIRED("EXPIRED"),
    MISGRADING("MISGRADING"),
    UNDEFINED("UNDEFINED"),
    INCORRECT_IMEI("INCORRECT_IMEI"),
    INCORRECT_SERIAL_NUMBER("INCORRECT_SERIAL_NUMBER"),
    INCORRECT_CIS("INCORRECT_CIS"),
    PART_MISSING("PART_MISSING"),
    NON_COMPLIENT("NON_COMPLIENT"),
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
    SERVICE("SERVICE"),
    MARKDOWN("MARKDOWN"),
    DEMO("DEMO"),
    REPAIR("REPAIR"),
    FIRMWARE("FIRMWARE"),
    UNKNOWN("UNKNOWN");

    private String value;

    ReturnInstanceStockType(String value) {
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
    public static ReturnInstanceStockType fromValue(String text) {
        for (ReturnInstanceStockType b : ReturnInstanceStockType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

