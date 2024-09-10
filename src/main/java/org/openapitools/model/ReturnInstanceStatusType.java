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
 * Логистический статус конкретного товара.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

