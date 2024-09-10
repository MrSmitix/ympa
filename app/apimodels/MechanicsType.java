package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
 */
public enum MechanicsType {
  
  DIRECT_DISCOUNT("DIRECT_DISCOUNT"),
  
  BLUE_FLASH("BLUE_FLASH"),
  
  MARKET_PROMOCODE("MARKET_PROMOCODE");

  private final String value;

  MechanicsType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MechanicsType fromValue(String value) {
    for (MechanicsType b : MechanicsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

