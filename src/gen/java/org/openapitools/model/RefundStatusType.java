package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Cтатус возврата денег:  * &#x60;STARTED_BY_USER&#x60; — создан клиентом из личного кабинета.  * &#x60;REFUND_IN_PROGRESS&#x60; — ждет решение о возврате денег.  * &#x60;REFUNDED&#x60; — по возврату проведены все возвратные денежные транзакции.  * &#x60;FAILED&#x60; — невозможно провести возврат покупателю.  * &#x60;WAITING_FOR_DECISION&#x60; — ожидает решения.  * &#x60;DECISION_MADE&#x60; — по возврату принято решение.  * &#x60;REFUNDED_WITH_BONUSES&#x60; — возврат осуществлен баллами Плюса или промокодом.  * &#x60;REFUNDED_BY_SHOP&#x60; — магазин сделал самостоятельно возврат денег.  * &#x60;COMPLETE_WITHOUT_REFUND&#x60; — возврат денег не требуется.  * &#x60;CANCELLED&#x60; — возврат отменен. 
 */
public enum RefundStatusType {
  
  STARTED_BY_USER("STARTED_BY_USER"),
  
  REFUND_IN_PROGRESS("REFUND_IN_PROGRESS"),
  
  REFUNDED("REFUNDED"),
  
  FAILED("FAILED"),
  
  WAITING_FOR_DECISION("WAITING_FOR_DECISION"),
  
  DECISION_MADE("DECISION_MADE"),
  
  REFUNDED_WITH_BONUSES("REFUNDED_WITH_BONUSES"),
  
  REFUNDED_BY_SHOP("REFUNDED_BY_SHOP"),
  
  CANCELLED("CANCELLED"),
  
  COMPLETE_WITHOUT_REFUND("COMPLETE_WITHOUT_REFUND"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RefundStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RefundStatusType fromValue(String value) {
    for (RefundStatusType b : RefundStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

