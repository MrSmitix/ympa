package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 */
public enum PriceCompetitivenessType {
  
  OPTIMAL("OPTIMAL"),
  
  AVERAGE("AVERAGE"),
  
  LOW("LOW");

  private final String value;

  PriceCompetitivenessType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriceCompetitivenessType fromValue(String value) {
    for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

