package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
 */
public enum OrderUpdateStatusType {
  
  OK("OK"),
  
  ERROR("ERROR");

  private String value;

  OrderUpdateStatusType(String value) {
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

  public static OrderUpdateStatusType fromValue(String value) {
    for (OrderUpdateStatusType b : OrderUpdateStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}