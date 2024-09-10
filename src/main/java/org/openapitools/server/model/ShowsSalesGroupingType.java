package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */

public enum ShowsSalesGroupingType {

    CATEGORIES("CATEGORIES"),
    OFFERS("OFFERS");

    private String value;

    ShowsSalesGroupingType(String value) {
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
    public static ShowsSalesGroupingType fromValue(String text) {
        for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

