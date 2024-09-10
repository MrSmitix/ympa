package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AddOffersToArchiveErrorType {

    @JsonProperty("OFFER_HAS_STOCKS") OFFER_HAS_STOCKS(String.valueOf("OFFER_HAS_STOCKS")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    AddOffersToArchiveErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AddOffersToArchiveErrorType fromValue(String value) {
        for (AddOffersToArchiveErrorType b : AddOffersToArchiveErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



