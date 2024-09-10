package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 */

public enum AddOffersToArchiveErrorType {

    OFFER_HAS_STOCKS("OFFER_HAS_STOCKS"),
    UNKNOWN("UNKNOWN");

    private String value;

    AddOffersToArchiveErrorType(String value) {
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
    public static AddOffersToArchiveErrorType fromValue(String text) {
        for (AddOffersToArchiveErrorType b : AddOffersToArchiveErrorType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

