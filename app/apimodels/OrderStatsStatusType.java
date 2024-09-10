package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
 */
public enum OrderStatsStatusType {
  
  CANCELLED_BEFORE_PROCESSING("CANCELLED_BEFORE_PROCESSING"),
  
  CANCELLED_IN_DELIVERY("CANCELLED_IN_DELIVERY"),
  
  CANCELLED_IN_PROCESSING("CANCELLED_IN_PROCESSING"),
  
  DELIVERY("DELIVERY"),
  
  DELIVERED("DELIVERED"),
  
  PARTIALLY_DELIVERED("PARTIALLY_DELIVERED"),
  
  PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
  
  PENDING("PENDING"),
  
  PICKUP("PICKUP"),
  
  PROCESSING("PROCESSING"),
  
  RESERVED("RESERVED"),
  
  RETURNED("RETURNED"),
  
  UNKNOWN("UNKNOWN"),
  
  UNPAID("UNPAID"),
  
  LOST("LOST");

  private final String value;

  OrderStatsStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderStatsStatusType fromValue(String value) {
    for (OrderStatsStatusType b : OrderStatsStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

