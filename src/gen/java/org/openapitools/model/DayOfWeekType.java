package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * День недели:  * &#x60;MONDAY&#x60; — понедельник. * &#x60;TUESDAY&#x60; — вторник. * &#x60;WEDNESDAY&#x60; — среда. * &#x60;THURSDAY&#x60; — четверг. * &#x60;FRIDAY&#x60; — пятница. * &#x60;SATURDAY&#x60; — суббота. * &#x60;SUNDAY&#x60; — воскресенье. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DayOfWeekType {

    @JsonProperty("MONDAY") MONDAY(String.valueOf("MONDAY")), @JsonProperty("TUESDAY") TUESDAY(String.valueOf("TUESDAY")), @JsonProperty("WEDNESDAY") WEDNESDAY(String.valueOf("WEDNESDAY")), @JsonProperty("THURSDAY") THURSDAY(String.valueOf("THURSDAY")), @JsonProperty("FRIDAY") FRIDAY(String.valueOf("FRIDAY")), @JsonProperty("SATURDAY") SATURDAY(String.valueOf("SATURDAY")), @JsonProperty("SUNDAY") SUNDAY(String.valueOf("SUNDAY"));


    private String value;

    DayOfWeekType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DayOfWeekType fromValue(String value) {
        for (DayOfWeekType b : DayOfWeekType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



