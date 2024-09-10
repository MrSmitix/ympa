package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum EacVerificationStatusType {

    @JsonProperty("ACCEPTED") ACCEPTED(String.valueOf("ACCEPTED")), @JsonProperty("REJECTED") REJECTED(String.valueOf("REJECTED")), @JsonProperty("NEED_UPDATE") NEED_UPDATE(String.valueOf("NEED_UPDATE"));


    private String value;

    EacVerificationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EacVerificationStatusType fromValue(String value) {
        for (EacVerificationStatusType b : EacVerificationStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



