package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */
public enum OrderDeliveryType {
  
  DELIVERY("DELIVERY"),
  
  PICKUP("PICKUP"),
  
  POST("POST"),
  
  DIGITAL("DIGITAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderDeliveryType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderDeliveryType fromValue(String value) {
    for (OrderDeliveryType b : OrderDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

