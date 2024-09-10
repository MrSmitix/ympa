package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */
public enum OrdersStatsItemStatusType {
  
  REJECTED("REJECTED"),
  
  RETURNED("RETURNED");

  private String value;

  OrdersStatsItemStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrdersStatsItemStatusType fromValue(String value) {
    for (OrdersStatsItemStatusType b : OrdersStatsItemStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

