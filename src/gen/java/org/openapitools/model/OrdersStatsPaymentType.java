package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrdersStatsPaymentType fromValue(String text) {
    for (OrdersStatsPaymentType b : OrdersStatsPaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


