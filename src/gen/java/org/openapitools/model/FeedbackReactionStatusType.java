package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedbackReactionStatusType {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("NEED_REACTION") NEED_REACTION(String.valueOf("NEED_REACTION"));


    private String value;

    FeedbackReactionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedbackReactionStatusType fromValue(String value) {
        for (FeedbackReactionStatusType b : FeedbackReactionStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



