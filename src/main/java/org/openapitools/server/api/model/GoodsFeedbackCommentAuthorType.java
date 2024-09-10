package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GoodsFeedbackCommentAuthorType fromValue(String value) {
    for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}