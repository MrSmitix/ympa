package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
 */
public enum FeedStatusType {
  
  ERROR("ERROR"),
  
  NA("NA"),
  
  OK("OK");

  private String value;

  FeedStatusType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedStatusType fromValue(String value) {
    for (FeedStatusType b : FeedStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}