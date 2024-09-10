package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |&#x60;LOW&#x60;|&#x60;turnoverDays&#x60; ≥ 120|| |&#x60;ALMOST_LOW&#x60;|100 ≤ &#x60;turnoverDays&#x60; &lt; 120|| |&#x60;HIGH&#x60;|45 ≤ &#x60;turnoverDays&#x60; &lt; 100|| |&#x60;VERY_HIGH&#x60;|0 ≤ &#x60;turnoverDays&#x60; &lt; 45|| |&#x60;NO_SALES&#x60;|—|Продаж нет.| |&#x60;FREE_STORE&#x60;|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TurnoverType {

    @JsonProperty("LOW") LOW(String.valueOf("LOW")), @JsonProperty("ALMOST_LOW") ALMOST_LOW(String.valueOf("ALMOST_LOW")), @JsonProperty("HIGH") HIGH(String.valueOf("HIGH")), @JsonProperty("VERY_HIGH") VERY_HIGH(String.valueOf("VERY_HIGH")), @JsonProperty("NO_SALES") NO_SALES(String.valueOf("NO_SALES")), @JsonProperty("FREE_STORE") FREE_STORE(String.valueOf("FREE_STORE"));


    private String value;

    TurnoverType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TurnoverType fromValue(String value) {
        for (TurnoverType b : TurnoverType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



