package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
 */
public enum OutletVisibilityType {
  
  HIDDEN("HIDDEN"),
  
  VISIBLE("VISIBLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OutletVisibilityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OutletVisibilityType fromValue(String text) {
    for (OutletVisibilityType b : OutletVisibilityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


