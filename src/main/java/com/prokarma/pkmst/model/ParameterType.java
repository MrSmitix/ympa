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
 * Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ParameterType fromValue(String text) {
    for (ParameterType b : ParameterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

