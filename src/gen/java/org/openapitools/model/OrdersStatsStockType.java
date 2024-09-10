package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsStockType {

    @JsonProperty("FIT") FIT(String.valueOf("FIT")), @JsonProperty("FREEZE") FREEZE(String.valueOf("FREEZE")), @JsonProperty("AVAILABLE") AVAILABLE(String.valueOf("AVAILABLE")), @JsonProperty("QUARANTINE") QUARANTINE(String.valueOf("QUARANTINE")), @JsonProperty("UTILIZATION") UTILIZATION(String.valueOf("UTILIZATION")), @JsonProperty("DEFECT") DEFECT(String.valueOf("DEFECT")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    OrdersStatsStockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsStockType fromValue(String value) {
        for (OrdersStatsStockType b : OrdersStatsStockType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



