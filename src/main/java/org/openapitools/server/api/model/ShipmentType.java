package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Способ отгрузки заказов:  * &#x60;IMPORT&#x60; — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * &#x60;WITHDRAW&#x60; — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ отгрузки заказов:  * &#x60;IMPORT&#x60; — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * &#x60;WITHDRAW&#x60; — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 */
public enum ShipmentType {
  
  IMPORT("IMPORT"),
  
  WITHDRAW("WITHDRAW");

  private String value;

  ShipmentType(String value) {
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

  public static ShipmentType fromValue(String value) {
    for (ShipmentType b : ShipmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}