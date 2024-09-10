package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */
public enum FeedbackCommentAuthorType {
  
  USER("USER"),
  
  SHOP("SHOP");

  private final String value;

  FeedbackCommentAuthorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedbackCommentAuthorType fromValue(String value) {
    for (FeedbackCommentAuthorType b : FeedbackCommentAuthorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

