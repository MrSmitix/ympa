package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

