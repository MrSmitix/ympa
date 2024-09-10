package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OutletType {

    @JsonProperty("DEPOT") DEPOT(String.valueOf("DEPOT")), @JsonProperty("MIXED") MIXED(String.valueOf("MIXED")), @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL")), @JsonProperty("NOT_DEFINED") NOT_DEFINED(String.valueOf("NOT_DEFINED"));


    private String value;

    OutletType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OutletType fromValue(String value) {
        for (OutletType b : OutletType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



