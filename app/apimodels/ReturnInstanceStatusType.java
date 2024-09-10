package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Логистический статус конкретного товара.
 */
public enum ReturnInstanceStatusType {
  
  CREATED("CREATED"),
  
  RECEIVED("RECEIVED"),
  
  IN_TRANSIT("IN_TRANSIT"),
  
  READY_FOR_PICKUP("READY_FOR_PICKUP"),
  
  PICKED("PICKED"),
  
  RECEIVED_ON_FULFILLMENT("RECEIVED_ON_FULFILLMENT"),
  
  CANCELLED("CANCELLED"),
  
  LOST("LOST"),
  
  UTILIZED("UTILIZED"),
  
  PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
  
  EXPROPRIATED("EXPROPRIATED"),
  
  NOT_IN_DEMAND("NOT_IN_DEMAND");

  private final String value;

  ReturnInstanceStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnInstanceStatusType fromValue(String value) {
    for (ReturnInstanceStatusType b : ReturnInstanceStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

