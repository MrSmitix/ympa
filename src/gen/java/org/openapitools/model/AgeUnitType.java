package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
 */
public enum AgeUnitType {
  
  YEAR("YEAR"),
  
  MONTH("MONTH");

  private String value;

  AgeUnitType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AgeUnitType fromValue(String value) {
    for (AgeUnitType b : AgeUnitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

