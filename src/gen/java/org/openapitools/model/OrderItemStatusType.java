package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 */
public enum OrderItemStatusType {
  
  REJECTED("REJECTED"),
  
  RETURNED("RETURNED");

  private String value;

  OrderItemStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderItemStatusType fromValue(String text) {
    for (OrderItemStatusType b : OrderItemStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


