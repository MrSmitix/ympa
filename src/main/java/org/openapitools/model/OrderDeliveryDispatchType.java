package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

