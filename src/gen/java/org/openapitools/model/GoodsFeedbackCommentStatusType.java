package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 */
public enum GoodsFeedbackCommentStatusType {
  
  PUBLISHED("PUBLISHED"),
  
  UNMODERATED("UNMODERATED"),
  
  BANNED("BANNED"),
  
  DELETED("DELETED");

  private String value;

  GoodsFeedbackCommentStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GoodsFeedbackCommentStatusType fromValue(String value) {
    for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

