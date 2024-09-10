package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */
public enum LicenseCheckStatusType {
  
  NEW("NEW"),
  
  SUCCESS("SUCCESS"),
  
  FAIL("FAIL"),
  
  REVOKE("REVOKE"),
  
  DONT_WANT("DONT_WANT"),
  
  FAIL_MANUAL("FAIL_MANUAL");

  private String value;

  LicenseCheckStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LicenseCheckStatusType fromValue(String value) {
    for (LicenseCheckStatusType b : LicenseCheckStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

