package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */
public enum ShowsSalesGroupingType {
  
  CATEGORIES("CATEGORIES"),
  
  OFFERS("OFFERS");

  private final String value;

  ShowsSalesGroupingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShowsSalesGroupingType fromValue(String value) {
    for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

