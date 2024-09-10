package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LanguageType fromValue(String value) {
    for (LanguageType b : LanguageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

