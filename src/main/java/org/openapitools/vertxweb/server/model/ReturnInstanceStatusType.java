package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Логистический статус конкретного товара.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  private String value;

  ReturnInstanceStatusType(String value) {
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

  public static ReturnInstanceStatusType fromValue(String value) {
    for (ReturnInstanceStatusType b : ReturnInstanceStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}