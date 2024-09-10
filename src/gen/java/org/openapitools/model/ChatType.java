package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
 */
public enum ChatType {
  
  CHAT("CHAT"),
  
  ARBITRAGE("ARBITRAGE");

  private String value;

  ChatType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatType fromValue(String text) {
    for (ChatType b : ChatType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


