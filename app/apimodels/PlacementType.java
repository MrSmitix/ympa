package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
 */
public enum PlacementType {
  
  FBS("FBS"),
  
  FBY("FBY"),
  
  DBS("DBS");

  private final String value;

  PlacementType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlacementType fromValue(String value) {
    for (PlacementType b : PlacementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

