package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Язык:  * `RU` — русский.  * `EN` — английский. 
 */
public enum LanguageType {
  
  RU("RU"),
  
  EN("EN");

  private String value;

  LanguageType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LanguageType fromValue(String text) {
    for (LanguageType b : LanguageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


