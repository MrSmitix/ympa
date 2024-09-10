package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
 */
public enum FieldStateType {
  
  SPECIFIED("SPECIFIED"),
  
  EMPTY("EMPTY");

  private final String value;

  FieldStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FieldStateType fromValue(String value) {
    for (FieldStateType b : FieldStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

