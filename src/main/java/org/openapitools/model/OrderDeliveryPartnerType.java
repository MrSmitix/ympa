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
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum OrderDeliveryPartnerType {
  
  SHOP("SHOP"),
  
  YANDEX_MARKET("YANDEX_MARKET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderDeliveryPartnerType(String value) {
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
  public static OrderDeliveryPartnerType fromValue(String value) {
    for (OrderDeliveryPartnerType b : OrderDeliveryPartnerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

