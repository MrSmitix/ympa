package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 */
public enum OrderDocumentStatusType {
  
  READY("READY"),
  
  NOT_READY("NOT_READY");

  private String value;

  OrderDocumentStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderDocumentStatusType fromValue(String text) {
    for (OrderDocumentStatusType b : OrderDocumentStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


