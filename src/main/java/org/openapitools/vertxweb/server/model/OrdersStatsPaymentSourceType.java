package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 */
public enum OrdersStatsPaymentSourceType {
  
  BUYER("BUYER"),
  
  CASHBACK("CASHBACK"),
  
  MARKETPLACE("MARKETPLACE"),
  
  SPLIT("SPLIT");

  private String value;

  OrdersStatsPaymentSourceType(String value) {
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

  public static OrdersStatsPaymentSourceType fromValue(String value) {
    for (OrdersStatsPaymentSourceType b : OrdersStatsPaymentSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}