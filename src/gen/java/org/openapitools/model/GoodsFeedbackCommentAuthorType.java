package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
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
  public static GoodsFeedbackCommentAuthorType fromValue(String text) {
    for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

