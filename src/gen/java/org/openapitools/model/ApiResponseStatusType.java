package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип ответа.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApiResponseStatusType fromValue(String text) {
    for (ApiResponseStatusType b : ApiResponseStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


