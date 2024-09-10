package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TimeUnitType {

    @JsonProperty("HOUR") HOUR(String.valueOf("HOUR")), @JsonProperty("DAY") DAY(String.valueOf("DAY")), @JsonProperty("WEEK") WEEK(String.valueOf("WEEK")), @JsonProperty("MONTH") MONTH(String.valueOf("MONTH")), @JsonProperty("YEAR") YEAR(String.valueOf("YEAR"));


    private String value;

    TimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimeUnitType fromValue(String value) {
        for (TimeUnitType b : TimeUnitType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



