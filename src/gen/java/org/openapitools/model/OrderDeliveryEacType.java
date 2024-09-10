package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
 */
public enum OrderDeliveryEacType {
  
  MERCHANT_TO_COURIER("MERCHANT_TO_COURIER"),
  
  COURIER_TO_MERCHANT("COURIER_TO_MERCHANT"),
  
  CHECKING_BY_MERCHANT("CHECKING_BY_MERCHANT");

  private String value;

  OrderDeliveryEacType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderDeliveryEacType fromValue(String text) {
    for (OrderDeliveryEacType b : OrderDeliveryEacType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

