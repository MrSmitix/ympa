package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Причина обновления состава заказа.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderItemsModificationRequestReasonType fromValue(String value) {
    for (OrderItemsModificationRequestReasonType b : OrderItemsModificationRequestReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}