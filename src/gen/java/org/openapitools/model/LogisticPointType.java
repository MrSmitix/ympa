package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LogisticPointType {

    @JsonProperty("WAREHOUSE") WAREHOUSE(String.valueOf("WAREHOUSE")), @JsonProperty("PICKUP_POINT") PICKUP_POINT(String.valueOf("PICKUP_POINT")), @JsonProperty("PICKUP_TERMINAL") PICKUP_TERMINAL(String.valueOf("PICKUP_TERMINAL")), @JsonProperty("PICKUP_POST_OFFICE") PICKUP_POST_OFFICE(String.valueOf("PICKUP_POST_OFFICE")), @JsonProperty("PICKUP_MIXED") PICKUP_MIXED(String.valueOf("PICKUP_MIXED")), @JsonProperty("PICKUP_RETAIL") PICKUP_RETAIL(String.valueOf("PICKUP_RETAIL")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    LogisticPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LogisticPointType fromValue(String value) {
        for (LogisticPointType b : LogisticPointType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



