package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 */
public enum GoodsFeedbackCommentStatusType {
  
  PUBLISHED("PUBLISHED"),
  
  UNMODERATED("UNMODERATED"),
  
  BANNED("BANNED"),
  
  DELETED("DELETED");

  private final String value;

  GoodsFeedbackCommentStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GoodsFeedbackCommentStatusType fromValue(String value) {
    for (GoodsFeedbackCommentStatusType b : GoodsFeedbackCommentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

