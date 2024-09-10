package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 */
public enum SellingProgramType {
  
  FBY("FBY"),
  
  FBS("FBS"),
  
  DBS("DBS"),
  
  EXPRESS("EXPRESS");

  private String value;

  SellingProgramType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SellingProgramType fromValue(String value) {
    for (SellingProgramType b : SellingProgramType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

