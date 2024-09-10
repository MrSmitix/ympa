package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 */
public enum OfferSellingProgramStatusType {
  
  FINE("FINE"),
  
  REJECT("REJECT");

  private final String value;

  OfferSellingProgramStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferSellingProgramStatusType fromValue(String value) {
    for (OfferSellingProgramStatusType b : OfferSellingProgramStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

