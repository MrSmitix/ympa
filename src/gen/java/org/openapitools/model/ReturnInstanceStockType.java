package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип остатка на складе.
 */
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ReturnInstanceStockType fromString(String s) {
      for (ReturnInstanceStockType b : ReturnInstanceStockType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
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


