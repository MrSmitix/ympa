package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 */
public enum OrderDocumentStatusType {
  
  READY("READY"),
  
  NOT_READY("NOT_READY");

  private final String value;

  OrderDocumentStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderDocumentStatusType fromValue(String value) {
    for (OrderDocumentStatusType b : OrderDocumentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

