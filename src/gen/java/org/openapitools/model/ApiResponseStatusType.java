package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип ответа.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ApiResponseStatusType {

    @JsonProperty("OK") OK(String.valueOf("OK")), @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));


    private String value;

    ApiResponseStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApiResponseStatusType fromValue(String value) {
        for (ApiResponseStatusType b : ApiResponseStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



