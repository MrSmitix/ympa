package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 **/
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

  @JsonValue
  public String getValue() {
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