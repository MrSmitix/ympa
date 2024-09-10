package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 */
public enum GoodsFeedbackCommentAuthorType {
  
  USER("USER"),
  
  BUSINESS("BUSINESS");

  private final String value;

  GoodsFeedbackCommentAuthorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GoodsFeedbackCommentAuthorType fromValue(String value) {
    for (GoodsFeedbackCommentAuthorType b : GoodsFeedbackCommentAuthorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

