package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
 */
public enum OrdersStatsOrderPaymentType {
  
  CREDIT("CREDIT"),
  
  POSTPAID("POSTPAID"),
  
  PREPAID("PREPAID"),
  
  TINKOFF_CREDIT("TINKOFF_CREDIT");

  private final String value;

  OrdersStatsOrderPaymentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrdersStatsOrderPaymentType fromValue(String value) {
    for (OrdersStatsOrderPaymentType b : OrdersStatsOrderPaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

