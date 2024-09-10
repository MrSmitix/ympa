package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  ChatStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatStatusType fromValue(String value) {
    for (ChatStatusType b : ChatStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

