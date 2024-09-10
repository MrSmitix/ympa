package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedbackStateType {

    @JsonProperty("LAST") LAST(String.valueOf("LAST")), @JsonProperty("PREVIOUS") PREVIOUS(String.valueOf("PREVIOUS")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED"));


    private String value;

    FeedbackStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedbackStateType fromValue(String value) {
        for (FeedbackStateType b : FeedbackStateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



