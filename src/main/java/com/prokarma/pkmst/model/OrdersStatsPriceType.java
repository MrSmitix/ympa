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
 * Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
 */
public enum OrdersStatsPriceType {
  
  BUYER("BUYER"),
  
  CASHBACK("CASHBACK"),
  
  MARKETPLACE("MARKETPLACE");

  private String value;

  OrdersStatsPriceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrdersStatsPriceType fromValue(String text) {
    for (OrdersStatsPriceType b : OrdersStatsPriceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

