package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Решение по возврату.
 */
public enum ReturnRequestDecisionType {
  
  REFUND_MONEY("REFUND_MONEY"),
  
  REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
  
  REPAIR("REPAIR"),
  
  REPLACE("REPLACE"),
  
  SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
  
  DECLINE_REFUND("DECLINE_REFUND"),
  
  OTHER_DECISION("OTHER_DECISION");

  private final String value;

  ReturnRequestDecisionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnRequestDecisionType fromValue(String value) {
    for (ReturnRequestDecisionType b : ReturnRequestDecisionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

