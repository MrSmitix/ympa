package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferConditionQualityType {

    @JsonProperty("PERFECT") PERFECT(String.valueOf("PERFECT")), @JsonProperty("EXCELLENT") EXCELLENT(String.valueOf("EXCELLENT")), @JsonProperty("GOOD") GOOD(String.valueOf("GOOD")), @JsonProperty("NOT_SPECIFIED") NOT_SPECIFIED(String.valueOf("NOT_SPECIFIED"));


    private String value;

    OfferConditionQualityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferConditionQualityType fromValue(String value) {
        for (OfferConditionQualityType b : OfferConditionQualityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



