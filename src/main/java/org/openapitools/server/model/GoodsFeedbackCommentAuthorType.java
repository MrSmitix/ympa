package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 */

public enum GoodsFeedbackCommentAuthorType {

    USER("USER"),
    BUSINESS("BUSINESS");

    private String value;

    GoodsFeedbackCommentAuthorType(String value) {
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
    public static GoodsFeedbackCommentAuthorType fromValue(String text) {
        for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

