package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
 */
public enum ChatType {
  
  CHAT("CHAT"),
  
  ARBITRAGE("ARBITRAGE");

  private final String value;

  ChatType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatType fromValue(String value) {
    for (ChatType b : ChatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

