package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Язык:  * `RU` — русский.  * `EN` — английский. 
 */
public enum LanguageType {
  
  RU("RU"),
  
  EN("EN");

  private final String value;

  LanguageType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LanguageType fromValue(String value) {
    for (LanguageType b : LanguageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

