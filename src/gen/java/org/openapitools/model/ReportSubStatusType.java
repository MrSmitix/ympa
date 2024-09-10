package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReportSubStatusType {

    @JsonProperty("NO_DATA") NO_DATA(String.valueOf("NO_DATA")), @JsonProperty("TOO_LARGE") TOO_LARGE(String.valueOf("TOO_LARGE")), @JsonProperty("RESOURCE_NOT_FOUND") RESOURCE_NOT_FOUND(String.valueOf("RESOURCE_NOT_FOUND"));


    private String value;

    ReportSubStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportSubStatusType fromValue(String value) {
        for (ReportSubStatusType b : ReportSubStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



