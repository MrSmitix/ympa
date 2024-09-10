package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Способ отгрузки:  * &#x60;BUYER&#x60; — доставка покупателю.  * &#x60;MARKET_PARTNER_OUTLET&#x60; — доставка в пункт выдачи партнера.  * &#x60;MARKET_BRANDED_OUTLET&#x60; — доставка в пункт выдачи заказов Маркета.  * &#x60;SHOP_OUTLET&#x60; — доставка в пункт выдачи заказов магазина.  * &#x60;DROPOFF&#x60; — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ отгрузки:  * &#x60;BUYER&#x60; — доставка покупателю.  * &#x60;MARKET_PARTNER_OUTLET&#x60; — доставка в пункт выдачи партнера.  * &#x60;MARKET_BRANDED_OUTLET&#x60; — доставка в пункт выдачи заказов Маркета.  * &#x60;SHOP_OUTLET&#x60; — доставка в пункт выдачи заказов магазина.  * &#x60;DROPOFF&#x60; — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */
public enum OrderDeliveryDispatchType {
  
  UNKNOWN("UNKNOWN"),
  
  BUYER("BUYER"),
  
  MARKET_PARTNER_OUTLET("MARKET_PARTNER_OUTLET"),
  
  MARKET_BRANDED_OUTLET("MARKET_BRANDED_OUTLET"),
  
  SHOP_OUTLET("SHOP_OUTLET"),
  
  DROPOFF("DROPOFF");

  private String value;

  OrderDeliveryDispatchType(String value) {
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

  public static OrderDeliveryDispatchType fromValue(String value) {
    for (OrderDeliveryDispatchType b : OrderDeliveryDispatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}