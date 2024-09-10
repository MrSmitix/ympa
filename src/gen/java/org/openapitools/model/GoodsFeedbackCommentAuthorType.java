package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 */
public enum GoodsFeedbackCommentAuthorType {
  
  USER("USER"),
  
  BUSINESS("BUSINESS");

  private String value;

  GoodsFeedbackCommentAuthorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GoodsFeedbackCommentAuthorType fromValue(String value) {
    for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

