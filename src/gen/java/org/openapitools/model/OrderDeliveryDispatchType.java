package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrderDeliveryDispatchType fromString(String s) {
      for (OrderDeliveryDispatchType b : OrderDeliveryDispatchType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderDeliveryDispatchType fromValue(String value) {
    for (OrderDeliveryDispatchType b : OrderDeliveryDispatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


