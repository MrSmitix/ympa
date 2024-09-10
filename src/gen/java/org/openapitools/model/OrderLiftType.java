package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип подъема заказа на этаж:  * &#x60;NOT_NEEDED&#x60; — не требуется.  * &#x60;MANUAL&#x60; — ручной.  * &#x60;ELEVATOR&#x60; — лифт.  * &#x60;CARGO_ELEVATOR&#x60; — грузовой лифт.  * &#x60;FREE&#x60; — любой из перечисленных выше, если включена опция бесплатного подъема.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */
public enum OrderLiftType {
  
  NOT_NEEDED("NOT_NEEDED"),
  
  MANUAL("MANUAL"),
  
  ELEVATOR("ELEVATOR"),
  
  CARGO_ELEVATOR("CARGO_ELEVATOR"),
  
  FREE("FREE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderLiftType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderLiftType fromValue(String value) {
    for (OrderLiftType b : OrderLiftType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

