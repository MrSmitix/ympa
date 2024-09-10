package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип остатка на складе.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnInstanceStockType {

    @JsonProperty("FIT") FIT(String.valueOf("FIT")), @JsonProperty("DEFECT") DEFECT(String.valueOf("DEFECT")), @JsonProperty("ANOMALY") ANOMALY(String.valueOf("ANOMALY")), @JsonProperty("SURPLUS") SURPLUS(String.valueOf("SURPLUS")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED")), @JsonProperty("MISGRADING") MISGRADING(String.valueOf("MISGRADING")), @JsonProperty("UNDEFINED") UNDEFINED(String.valueOf("UNDEFINED")), @JsonProperty("INCORRECT_IMEI") INCORRECT_IMEI(String.valueOf("INCORRECT_IMEI")), @JsonProperty("INCORRECT_SERIAL_NUMBER") INCORRECT_SERIAL_NUMBER(String.valueOf("INCORRECT_SERIAL_NUMBER")), @JsonProperty("INCORRECT_CIS") INCORRECT_CIS(String.valueOf("INCORRECT_CIS")), @JsonProperty("PART_MISSING") PART_MISSING(String.valueOf("PART_MISSING")), @JsonProperty("NON_COMPLIENT") NON_COMPLIENT(String.valueOf("NON_COMPLIENT")), @JsonProperty("NOT_ACCEPTABLE") NOT_ACCEPTABLE(String.valueOf("NOT_ACCEPTABLE")), @JsonProperty("SERVICE") SERVICE(String.valueOf("SERVICE")), @JsonProperty("MARKDOWN") MARKDOWN(String.valueOf("MARKDOWN")), @JsonProperty("DEMO") DEMO(String.valueOf("DEMO")), @JsonProperty("REPAIR") REPAIR(String.valueOf("REPAIR")), @JsonProperty("FIRMWARE") FIRMWARE(String.valueOf("FIRMWARE")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    ReturnInstanceStockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnInstanceStockType fromValue(String value) {
        for (ReturnInstanceStockType b : ReturnInstanceStockType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



