package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
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
  public static OrderDocumentStatusType fromValue(String value) {
    for (OrderDocumentStatusType b : OrderDocumentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

