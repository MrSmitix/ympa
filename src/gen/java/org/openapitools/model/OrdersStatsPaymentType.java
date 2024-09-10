package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 */
public enum OrdersStatsPaymentType {
  
  PAYMENT("PAYMENT"),
  
  REFUND("REFUND"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrdersStatsPaymentType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrdersStatsPaymentType fromValue(String value) {
    for (OrdersStatsPaymentType b : OrdersStatsPaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

