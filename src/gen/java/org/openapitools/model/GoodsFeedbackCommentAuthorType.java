package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GoodsFeedbackCommentAuthorType {

    @JsonProperty("USER") USER(String.valueOf("USER")), @JsonProperty("BUSINESS") BUSINESS(String.valueOf("BUSINESS"));


    private String value;

    GoodsFeedbackCommentAuthorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GoodsFeedbackCommentAuthorType fromValue(String value) {
        for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



