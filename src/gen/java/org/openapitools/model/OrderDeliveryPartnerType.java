package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderDeliveryPartnerType fromValue(String text) {
    for (OrderDeliveryPartnerType b : OrderDeliveryPartnerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


