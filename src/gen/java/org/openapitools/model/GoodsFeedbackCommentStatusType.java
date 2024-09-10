package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GoodsFeedbackCommentStatusType {

    @JsonProperty("PUBLISHED") PUBLISHED(String.valueOf("PUBLISHED")), @JsonProperty("UNMODERATED") UNMODERATED(String.valueOf("UNMODERATED")), @JsonProperty("BANNED") BANNED(String.valueOf("BANNED")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED"));


    private String value;

    GoodsFeedbackCommentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GoodsFeedbackCommentStatusType fromValue(String value) {
        for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



