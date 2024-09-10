package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 */
public enum OrdersStatsOrderPaymentType {
  
  CREDIT("CREDIT"),
  
  POSTPAID("POSTPAID"),
  
  PREPAID("PREPAID"),
  
  TINKOFF_CREDIT("TINKOFF_CREDIT");

  private String value;

  OrdersStatsOrderPaymentType(String value) {
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

  public static OrdersStatsOrderPaymentType fromValue(String value) {
    for (OrdersStatsOrderPaymentType b : OrdersStatsOrderPaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}