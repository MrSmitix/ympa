package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */
public enum CategoryErrorType {
  
  UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
  
  CATEGORY_IS_NOT_LEAF("CATEGORY_IS_NOT_LEAF");

  private String value;

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

