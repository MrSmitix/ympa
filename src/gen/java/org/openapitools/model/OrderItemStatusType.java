package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 */
public enum OrderItemStatusType {
  
  REJECTED("REJECTED"),
  
  RETURNED("RETURNED");

  private String value;

  OrderItemStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderItemStatusType fromValue(String value) {
    for (OrderItemStatusType b : OrderItemStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

