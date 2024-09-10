package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Текущий статус заказа:  * &#x60;CANCELLED_BEFORE_PROCESSING&#x60; — заказ отменен до начала его обработки.  * &#x60;CANCELLED_IN_DELIVERY&#x60; — заказ отменен во время его доставки.  * &#x60;CANCELLED_IN_PROCESSING&#x60; — заказ отменен во время его обработки.  * &#x60;DELIVERY&#x60; — заказ передан службе доставки.  * &#x60;DELIVERED&#x60; — заказ доставлен.  * &#x60;PARTIALLY_DELIVERED&#x60; — заказ частично доставлен.  * &#x60;PARTIALLY_RETURNED&#x60; — заказ частично возвращен покупателем.  * &#x60;PENDING&#x60; — заказ ожидает подтверждения.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт выдачи.  * &#x60;PROCESSING&#x60; — заказ в обработке.  * &#x60;RESERVED&#x60; — товар зарезервирован на складе.  * &#x60;RETURNED&#x60; — заказ полностью возвращен покупателем.  * &#x60;UNKNOWN&#x60; — неизвестный статус заказа.  * &#x60;UNPAID&#x60; — заказ от юридического лица ожидает оплаты.  * &#x60;LOST&#x60; — заказ утерян. 
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

  private String value;

  OrderStatsStatusType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrderStatsStatusType fromString(String s) {
      for (OrderStatsStatusType b : OrderStatsStatusType.values()) {
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
  public static OrderStatsStatusType fromValue(String value) {
    for (OrderStatsStatusType b : OrderStatsStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


