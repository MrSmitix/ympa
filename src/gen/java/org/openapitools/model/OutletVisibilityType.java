package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
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
  public String toString() {
    return String.valueOf(value);
  }

  public static OutletVisibilityType fromValue(String value) {
    for (OutletVisibilityType b : OutletVisibilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

