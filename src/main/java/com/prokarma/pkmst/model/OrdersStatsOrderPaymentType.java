package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrdersStatsOrderPaymentType fromValue(String text) {
    for (OrdersStatsOrderPaymentType b : OrdersStatsOrderPaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

