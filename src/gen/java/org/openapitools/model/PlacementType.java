package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Модель, по которой работает магазин:  * &#x60;FBS&#x60; — FBS или Экспресс. * &#x60;FBY&#x60; — FBY. * &#x60;DBS&#x60; — DBS. 
 */
public enum PlacementType {
  
  FBS("FBS"),
  
  FBY("FBY"),
  
  DBS("DBS");

  private String value;

  PlacementType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlacementType fromValue(String value) {
    for (PlacementType b : PlacementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

