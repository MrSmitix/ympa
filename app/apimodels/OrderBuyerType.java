package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 */
public enum OrderBuyerType {
  
  PERSON("PERSON"),
  
  BUSINESS("BUSINESS");

  private final String value;

  OrderBuyerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderBuyerType fromValue(String value) {
    for (OrderBuyerType b : OrderBuyerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

