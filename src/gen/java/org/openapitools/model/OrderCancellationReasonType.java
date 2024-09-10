package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 */
public enum OrderCancellationReasonType {
  
  DELIVERED("ORDER_DELIVERED"),
  
  IN_DELIVERY("ORDER_IN_DELIVERY");

  private String value;

  OrderCancellationReasonType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderCancellationReasonType fromValue(String text) {
    for (OrderCancellationReasonType b : OrderCancellationReasonType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


