package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShowsSalesGroupingType {

    @JsonProperty("CATEGORIES") CATEGORIES(String.valueOf("CATEGORIES")), @JsonProperty("OFFERS") OFFERS(String.valueOf("OFFERS"));


    private String value;

    ShowsSalesGroupingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShowsSalesGroupingType fromValue(String value) {
        for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



