package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 */
public enum OrderCancellationReasonType {
  
  DELIVERED("ORDER_DELIVERED"),
  
  IN_DELIVERY("ORDER_IN_DELIVERY");

  private String value;

  OrderCancellationReasonType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderCancellationReasonType fromValue(String value) {
    for (OrderCancellationReasonType b : OrderCancellationReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

