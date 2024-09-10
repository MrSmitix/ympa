package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Направление сортировки.  Возможные значения: - &#x60;ASC&#x60; — сортировка по возрастанию. - &#x60;DESC&#x60; — сортировка по убыванию. 
 */
public enum SortOrderType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  SortOrderType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SortOrderType fromValue(String value) {
    for (SortOrderType b : SortOrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

