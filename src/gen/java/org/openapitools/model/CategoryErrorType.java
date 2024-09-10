package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CategoryErrorType {

    @JsonProperty("UNKNOWN_CATEGORY") UNKNOWN_CATEGORY(String.valueOf("UNKNOWN_CATEGORY")), @JsonProperty("CATEGORY_IS_NOT_LEAF") CATEGORY_IS_NOT_LEAF(String.valueOf("CATEGORY_IS_NOT_LEAF"));


    private String value;

    CategoryErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CategoryErrorType fromValue(String value) {
        for (CategoryErrorType b : CategoryErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



