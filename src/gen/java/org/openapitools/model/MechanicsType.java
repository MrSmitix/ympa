package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MechanicsType {

    @JsonProperty("DIRECT_DISCOUNT") DIRECT_DISCOUNT(String.valueOf("DIRECT_DISCOUNT")), @JsonProperty("BLUE_FLASH") BLUE_FLASH(String.valueOf("BLUE_FLASH")), @JsonProperty("MARKET_PROMOCODE") MARKET_PROMOCODE(String.valueOf("MARKET_PROMOCODE"));


    private String value;

    MechanicsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MechanicsType fromValue(String value) {
        for (MechanicsType b : MechanicsType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



