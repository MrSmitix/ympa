package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип ответа.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип ответа.
 */
public enum ApiResponseStatusType {
  
  OK("OK"),
  
  ERROR("ERROR");

  private String value;

  ApiResponseStatusType(String value) {
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

  public static ApiResponseStatusType fromValue(String value) {
    for (ApiResponseStatusType b : ApiResponseStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}