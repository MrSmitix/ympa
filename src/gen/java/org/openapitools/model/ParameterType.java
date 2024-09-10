package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ParameterType {

    @JsonProperty("TEXT") TEXT(String.valueOf("TEXT")), @JsonProperty("ENUM") ENUM(String.valueOf("ENUM")), @JsonProperty("BOOLEAN") BOOLEAN(String.valueOf("BOOLEAN")), @JsonProperty("NUMERIC") NUMERIC(String.valueOf("NUMERIC"));


    private String value;

    ParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ParameterType fromValue(String value) {
        for (ParameterType b : ParameterType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



