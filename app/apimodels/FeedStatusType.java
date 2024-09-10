package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
 */
public enum FeedStatusType {
  
  ERROR("ERROR"),
  
  NA("NA"),
  
  OK("OK");

  private final String value;

  FeedStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedStatusType fromValue(String value) {
    for (FeedStatusType b : FeedStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

