package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
 */
public enum OrderSubsidyType {
  
  YANDEX_CASHBACK("YANDEX_CASHBACK"),
  
  SUBSIDY("SUBSIDY"),
  
  DELIVERY("DELIVERY");

  private String value;

  OrderSubsidyType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderSubsidyType fromValue(String value) {
    for (OrderSubsidyType b : OrderSubsidyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

