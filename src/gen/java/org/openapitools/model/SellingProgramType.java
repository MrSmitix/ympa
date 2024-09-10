package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum SellingProgramType {

    @JsonProperty("FBY") FBY(String.valueOf("FBY")), @JsonProperty("FBS") FBS(String.valueOf("FBS")), @JsonProperty("DBS") DBS(String.valueOf("DBS")), @JsonProperty("EXPRESS") EXPRESS(String.valueOf("EXPRESS"));


    private String value;

    SellingProgramType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SellingProgramType fromValue(String value) {
        for (SellingProgramType b : SellingProgramType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



