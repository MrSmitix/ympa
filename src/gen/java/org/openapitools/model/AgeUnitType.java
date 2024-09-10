package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static AgeUnitType fromValue(String value) {
    for (AgeUnitType b : AgeUnitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

