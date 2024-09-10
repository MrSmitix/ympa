package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */
public enum OrderStatusType {
  
  PLACING("PLACING"),
  
  RESERVED("RESERVED"),
  
  UNPAID("UNPAID"),
  
  PROCESSING("PROCESSING"),
  
  DELIVERY("DELIVERY"),
  
  PICKUP("PICKUP"),
  
  DELIVERED("DELIVERED"),
  
  CANCELLED("CANCELLED"),
  
  PENDING("PENDING"),
  
  PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
  
  RETURNED("RETURNED"),
  
  UNKNOWN("UNKNOWN");

  private final String value;

  OrderStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderStatusType fromValue(String value) {
    for (OrderStatusType b : OrderStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

