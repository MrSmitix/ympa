package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
 */
public enum ParameterType {
  
  TEXT("TEXT"),
  
  ENUM("ENUM"),
  
  BOOLEAN("BOOLEAN"),
  
  NUMERIC("NUMERIC");

  private String value;

  ParameterType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParameterType fromValue(String value) {
    for (ParameterType b : ParameterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

