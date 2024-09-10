package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

