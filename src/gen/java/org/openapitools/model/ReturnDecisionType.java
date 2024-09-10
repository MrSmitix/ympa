package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. 
 */
public enum ReturnDecisionType {
  
  REFUND_MONEY("REFUND_MONEY"),
  
  REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
  
  REPAIR("REPAIR"),
  
  REPLACE("REPLACE"),
  
  SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
  
  DECLINE_REFUND("DECLINE_REFUND"),
  
  OTHER_DECISION("OTHER_DECISION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnDecisionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionType fromValue(String text) {
    for (ReturnDecisionType b : ReturnDecisionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


