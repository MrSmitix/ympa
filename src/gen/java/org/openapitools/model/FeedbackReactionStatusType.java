package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 */
public enum FeedbackReactionStatusType {
  
  ALL("ALL"),
  
  NEED_REACTION("NEED_REACTION");

  private String value;

  FeedbackReactionStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedbackReactionStatusType fromValue(String value) {
    for (FeedbackReactionStatusType b : FeedbackReactionStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

