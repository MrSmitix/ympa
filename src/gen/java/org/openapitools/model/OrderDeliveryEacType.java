package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
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
  public static OrderDeliveryEacType fromValue(String value) {
    for (OrderDeliveryEacType b : OrderDeliveryEacType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

