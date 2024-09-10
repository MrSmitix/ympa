package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedbackCommentAuthorType {

    @JsonProperty("USER") USER(String.valueOf("USER")), @JsonProperty("SHOP") SHOP(String.valueOf("SHOP"));


    private String value;

    FeedbackCommentAuthorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedbackCommentAuthorType fromValue(String value) {
        for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



