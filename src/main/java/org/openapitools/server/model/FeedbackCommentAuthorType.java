package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */

public enum FeedbackCommentAuthorType {

    USER("USER"),
    SHOP("SHOP");

    private String value;

    FeedbackCommentAuthorType(String value) {
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
    public static FeedbackCommentAuthorType fromValue(String text) {
        for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

