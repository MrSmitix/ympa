package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */
public enum CategoryErrorType {
  
  UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
  
  CATEGORY_IS_NOT_LEAF("CATEGORY_IS_NOT_LEAF");

  private final String value;

  CategoryErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CategoryErrorType fromValue(String value) {
    for (CategoryErrorType b : CategoryErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

