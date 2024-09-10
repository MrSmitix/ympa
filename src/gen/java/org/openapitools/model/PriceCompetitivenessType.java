package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PriceCompetitivenessType {

    @JsonProperty("OPTIMAL") OPTIMAL(String.valueOf("OPTIMAL")), @JsonProperty("AVERAGE") AVERAGE(String.valueOf("AVERAGE")), @JsonProperty("LOW") LOW(String.valueOf("LOW"));


    private String value;

    PriceCompetitivenessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PriceCompetitivenessType fromValue(String value) {
        for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



