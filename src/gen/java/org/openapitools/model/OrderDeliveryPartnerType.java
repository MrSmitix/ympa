package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */
public enum OrderDeliveryPartnerType {
  
  SHOP("SHOP"),
  
  YANDEX_MARKET("YANDEX_MARKET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderDeliveryPartnerType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderDeliveryPartnerType fromValue(String value) {
    for (OrderDeliveryPartnerType b : OrderDeliveryPartnerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

