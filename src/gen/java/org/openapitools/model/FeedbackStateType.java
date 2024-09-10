package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedbackStateType fromValue(String value) {
    for (FeedbackStateType b : FeedbackStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

