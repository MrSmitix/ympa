package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */
public enum FeedbackCommentAuthorType {
  
  USER("USER"),
  
  SHOP("SHOP");

  private String value;

  FeedbackCommentAuthorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedbackCommentAuthorType fromValue(String text) {
    for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

