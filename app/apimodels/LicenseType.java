package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
 */
public enum LicenseType {
  
  ALCOHOL("ALCOHOL"),
  
  UNKNOWN("UNKNOWN");

  private final String value;

  LicenseType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LicenseType fromValue(String value) {
    for (LicenseType b : LicenseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

