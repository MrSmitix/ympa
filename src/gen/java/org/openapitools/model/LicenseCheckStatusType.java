package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
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
  public static LicenseCheckStatusType fromValue(String text) {
    for (LicenseCheckStatusType b : LicenseCheckStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

