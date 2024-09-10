package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
 */
public enum OrdersStatsStockType {
  
  FIT("FIT"),
  
  FREEZE("FREEZE"),
  
  AVAILABLE("AVAILABLE"),
  
  QUARANTINE("QUARANTINE"),
  
  UTILIZATION("UTILIZATION"),
  
  DEFECT("DEFECT"),
  
  EXPIRED("EXPIRED");

  private String value;

  OrdersStatsStockType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrdersStatsStockType fromValue(String value) {
    for (OrdersStatsStockType b : OrdersStatsStockType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

