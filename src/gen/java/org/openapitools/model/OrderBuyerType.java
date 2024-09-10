package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */
public enum OrderBuyerType {
  
  PERSON("PERSON"),
  
  BUSINESS("BUSINESS");

  private String value;

  OrderBuyerType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderBuyerType fromValue(String value) {
    for (OrderBuyerType b : OrderBuyerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

