package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
 */
public enum FeedbackStateType {
  
  LAST("LAST"),
  
  PREVIOUS("PREVIOUS"),
  
  DELETED("DELETED");

  private String value;

  FeedbackStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedbackStateType fromValue(String value) {
    for (FeedbackStateType b : FeedbackStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

