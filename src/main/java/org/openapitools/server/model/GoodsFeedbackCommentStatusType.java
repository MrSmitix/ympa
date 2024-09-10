package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 */

public enum GoodsFeedbackCommentStatusType {

    PUBLISHED("PUBLISHED"),
    UNMODERATED("UNMODERATED"),
    BANNED("BANNED"),
    DELETED("DELETED");

    private String value;

    GoodsFeedbackCommentStatusType(String value) {
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
    public static GoodsFeedbackCommentStatusType fromValue(String text) {
        for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

