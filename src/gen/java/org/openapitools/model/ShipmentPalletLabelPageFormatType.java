package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShipmentPalletLabelPageFormatType {

    @JsonProperty("A4") A4(String.valueOf("A4")), @JsonProperty("A8") A8(String.valueOf("A8"));


    private String value;

    ShipmentPalletLabelPageFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShipmentPalletLabelPageFormatType fromValue(String value) {
        for (ShipmentPalletLabelPageFormatType b : ShipmentPalletLabelPageFormatType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



