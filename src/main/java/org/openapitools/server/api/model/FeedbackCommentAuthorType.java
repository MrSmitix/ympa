package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 */
public enum FeedbackCommentAuthorType {
  
  USER("USER"),
  
  SHOP("SHOP");

  private String value;

  FeedbackCommentAuthorType(String value) {
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

  public static FeedbackCommentAuthorType fromValue(String value) {
    for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}