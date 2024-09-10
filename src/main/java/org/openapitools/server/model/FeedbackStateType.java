package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */

public enum FeedbackStateType {

    LAST("LAST"),
    PREVIOUS("PREVIOUS"),
    DELETED("DELETED");

    private String value;

    FeedbackStateType(String value) {
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
    public static FeedbackStateType fromValue(String text) {
        for (FeedbackStateType b : FeedbackStateType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

