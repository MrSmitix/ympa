package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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