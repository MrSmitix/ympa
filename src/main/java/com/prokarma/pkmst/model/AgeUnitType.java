package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
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
  public static AgeUnitType fromValue(String text) {
    for (AgeUnitType b : AgeUnitType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}
