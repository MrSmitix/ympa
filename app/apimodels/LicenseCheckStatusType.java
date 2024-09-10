package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 */
public enum LicenseCheckStatusType {
  
  NEW("NEW"),
  
  SUCCESS("SUCCESS"),
  
  FAIL("FAIL"),
  
  REVOKE("REVOKE"),
  
  DONT_WANT("DONT_WANT"),
  
  FAIL_MANUAL("FAIL_MANUAL");

  private final String value;

  LicenseCheckStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LicenseCheckStatusType fromValue(String value) {
    for (LicenseCheckStatusType b : LicenseCheckStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

