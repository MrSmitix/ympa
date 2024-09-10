package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 */
public enum AgeUnitType {
  
  YEAR("YEAR"),
  
  MONTH("MONTH");

  private final String value;

  AgeUnitType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AgeUnitType fromValue(String value) {
    for (AgeUnitType b : AgeUnitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

