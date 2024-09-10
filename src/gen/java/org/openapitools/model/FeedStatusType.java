package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
 */
public enum FeedStatusType {
  
  ERROR("ERROR"),
  
  NA("NA"),
  
  OK("OK");

  private String value;

  FeedStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FeedStatusType fromValue(String text) {
    for (FeedStatusType b : FeedStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


