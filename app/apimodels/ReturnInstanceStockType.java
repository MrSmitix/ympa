package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

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

  private final String value;

  ReturnInstanceStockType(String value) {
    this.value = value;
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

