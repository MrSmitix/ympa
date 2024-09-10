package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
 */
public enum OrdersStatsPaymentSourceType {
  
  BUYER("BUYER"),
  
  CASHBACK("CASHBACK"),
  
  MARKETPLACE("MARKETPLACE"),
  
  SPLIT("SPLIT");

  private final String value;

  OrdersStatsPaymentSourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrdersStatsPaymentSourceType fromValue(String value) {
    for (OrdersStatsPaymentSourceType b : OrdersStatsPaymentSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

