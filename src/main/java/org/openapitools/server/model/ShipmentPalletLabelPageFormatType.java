package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 */

public enum ShipmentPalletLabelPageFormatType {

    A4("A4"),
    A8("A8");

    private String value;

    ShipmentPalletLabelPageFormatType(String value) {
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
    public static ShipmentPalletLabelPageFormatType fromValue(String text) {
        for (ShipmentPalletLabelPageFormatType b : ShipmentPalletLabelPageFormatType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

