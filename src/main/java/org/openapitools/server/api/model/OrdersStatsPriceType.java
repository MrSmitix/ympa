package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 */
public enum OrdersStatsPriceType {
  
  BUYER("BUYER"),
  
  CASHBACK("CASHBACK"),
  
  MARKETPLACE("MARKETPLACE");

  private String value;

  OrdersStatsPriceType(String value) {
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

  public static OrdersStatsPriceType fromValue(String value) {
    for (OrdersStatsPriceType b : OrdersStatsPriceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}