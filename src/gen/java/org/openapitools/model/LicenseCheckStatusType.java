package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LicenseCheckStatusType {

    @JsonProperty("NEW") NEW(String.valueOf("NEW")), @JsonProperty("SUCCESS") SUCCESS(String.valueOf("SUCCESS")), @JsonProperty("FAIL") FAIL(String.valueOf("FAIL")), @JsonProperty("REVOKE") REVOKE(String.valueOf("REVOKE")), @JsonProperty("DONT_WANT") DONT_WANT(String.valueOf("DONT_WANT")), @JsonProperty("FAIL_MANUAL") FAIL_MANUAL(String.valueOf("FAIL_MANUAL"));


    private String value;

    LicenseCheckStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LicenseCheckStatusType fromValue(String value) {
        for (LicenseCheckStatusType b : LicenseCheckStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



