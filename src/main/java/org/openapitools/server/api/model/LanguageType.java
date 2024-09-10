package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 */
public enum LanguageType {
  
  RU("RU"),
  
  EN("EN");

  private String value;

  LanguageType(String value) {
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

  public static LanguageType fromValue(String value) {
    for (LanguageType b : LanguageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}