package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

