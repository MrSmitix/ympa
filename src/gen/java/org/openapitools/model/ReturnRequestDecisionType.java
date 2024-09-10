package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

  private String value;

  ReturnRequestDecisionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReturnRequestDecisionType fromValue(String value) {
    for (ReturnRequestDecisionType b : ReturnRequestDecisionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

