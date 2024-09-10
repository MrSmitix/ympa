package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 */

public enum RejectedPromoOfferDeleteReasonType {

    OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

    private String value;

    RejectedPromoOfferDeleteReasonType(String value) {
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
    public static RejectedPromoOfferDeleteReasonType fromValue(String text) {
        for (RejectedPromoOfferDeleteReasonType b : RejectedPromoOfferDeleteReasonType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

