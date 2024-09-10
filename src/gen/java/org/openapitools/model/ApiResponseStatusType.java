package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

