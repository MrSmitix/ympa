package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
 */
public enum ChatStatusType {
  
  NEW("NEW"),
  
  WAITING_FOR_CUSTOMER("WAITING_FOR_CUSTOMER"),
  
  WAITING_FOR_PARTNER("WAITING_FOR_PARTNER"),
  
  WAITING_FOR_ARBITER("WAITING_FOR_ARBITER"),
  
  WAITING_FOR_MARKET("WAITING_FOR_MARKET"),
  
  FINISHED("FINISHED");

  private String value;

  ChatStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatStatusType fromValue(String text) {
    for (ChatStatusType b : ChatStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

