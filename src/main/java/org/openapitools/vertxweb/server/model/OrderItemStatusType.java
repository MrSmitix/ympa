package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 */
public enum OrderItemStatusType {
  
  REJECTED("REJECTED"),
  
  RETURNED("RETURNED");

  private String value;

  OrderItemStatusType(String value) {
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

  public static OrderItemStatusType fromValue(String value) {
    for (OrderItemStatusType b : OrderItemStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}