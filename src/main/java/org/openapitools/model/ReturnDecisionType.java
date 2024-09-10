package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionType fromValue(String value) {
    for (ReturnDecisionType b : ReturnDecisionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

