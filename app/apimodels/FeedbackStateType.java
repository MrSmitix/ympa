package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */
public enum FeedbackStateType {
  
  LAST("LAST"),
  
  PREVIOUS("PREVIOUS"),
  
  DELETED("DELETED");

  private final String value;

  FeedbackStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedbackStateType fromValue(String value) {
    for (FeedbackStateType b : FeedbackStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

