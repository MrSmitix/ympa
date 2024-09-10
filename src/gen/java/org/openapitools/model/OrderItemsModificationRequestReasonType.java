package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Причина обновления состава заказа.
 */
public enum OrderItemsModificationRequestReasonType {
  
  PARTNER_REQUESTED_REMOVE("PARTNER_REQUESTED_REMOVE"),
  
  USER_REQUESTED_REMOVE("USER_REQUESTED_REMOVE");

  private String value;

  OrderItemsModificationRequestReasonType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrderItemsModificationRequestReasonType fromString(String s) {
      for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
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
  public static OrderItemsModificationRequestReasonType fromValue(String value) {
    for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


