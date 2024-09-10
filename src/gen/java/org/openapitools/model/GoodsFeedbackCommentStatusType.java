package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GoodsFeedbackCommentStatusType fromValue(String text) {
    for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


