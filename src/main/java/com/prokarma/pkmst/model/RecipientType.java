package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
 */
public enum RecipientType {
  
  SHOP("SHOP"),
  
  DELIVERY_SERVICE("DELIVERY_SERVICE"),
  
  POST("POST");

  private String value;

  RecipientType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecipientType fromValue(String text) {
    for (RecipientType b : RecipientType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

