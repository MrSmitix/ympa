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
 * Тип остатка на складе.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum ReturnInstanceStockType {
  
  FIT("FIT"),
  
  DEFECT("DEFECT"),
  
  ANOMALY("ANOMALY"),
  
  SURPLUS("SURPLUS"),
  
  EXPIRED("EXPIRED"),
  
  MISGRADING("MISGRADING"),
  
  UNDEFINED("UNDEFINED"),
  
  INCORRECT_IMEI("INCORRECT_IMEI"),
  
  INCORRECT_SERIAL_NUMBER("INCORRECT_SERIAL_NUMBER"),
  
  INCORRECT_CIS("INCORRECT_CIS"),
  
  PART_MISSING("PART_MISSING"),
  
  NON_COMPLIENT("NON_COMPLIENT"),
  
  NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
  
  SERVICE("SERVICE"),
  
  MARKDOWN("MARKDOWN"),
  
  DEMO("DEMO"),
  
  REPAIR("REPAIR"),
  
  FIRMWARE("FIRMWARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnInstanceStockType(String value) {
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
  public static ReturnInstanceStockType fromValue(String value) {
    for (ReturnInstanceStockType b : ReturnInstanceStockType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

