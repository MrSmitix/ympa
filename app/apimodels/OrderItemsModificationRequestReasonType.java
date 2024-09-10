package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Причина обновления состава заказа.
 */
public enum OrderItemsModificationRequestReasonType {
  
  PARTNER_REQUESTED_REMOVE("PARTNER_REQUESTED_REMOVE"),
  
  USER_REQUESTED_REMOVE("USER_REQUESTED_REMOVE");

  private final String value;

  OrderItemsModificationRequestReasonType(String value) {
    this.value = value;
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

