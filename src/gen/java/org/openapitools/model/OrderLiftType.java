package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип подъема заказа на этаж:  * &#x60;NOT_NEEDED&#x60; — не требуется.  * &#x60;MANUAL&#x60; — ручной.  * &#x60;ELEVATOR&#x60; — лифт.  * &#x60;CARGO_ELEVATOR&#x60; — грузовой лифт.  * &#x60;FREE&#x60; — любой из перечисленных выше, если включена опция бесплатного подъема.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderLiftType {

    @JsonProperty("NOT_NEEDED") NOT_NEEDED(String.valueOf("NOT_NEEDED")), @JsonProperty("MANUAL") MANUAL(String.valueOf("MANUAL")), @JsonProperty("ELEVATOR") ELEVATOR(String.valueOf("ELEVATOR")), @JsonProperty("CARGO_ELEVATOR") CARGO_ELEVATOR(String.valueOf("CARGO_ELEVATOR")), @JsonProperty("FREE") FREE(String.valueOf("FREE")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderLiftType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderLiftType fromValue(String value) {
        for (OrderLiftType b : OrderLiftType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



