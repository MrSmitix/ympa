package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
 */
public enum MechanicsType {
  
  DIRECT_DISCOUNT("DIRECT_DISCOUNT"),
  
  BLUE_FLASH("BLUE_FLASH"),
  
  MARKET_PROMOCODE("MARKET_PROMOCODE");

  private String value;

  MechanicsType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MechanicsType fromValue(String value) {
    for (MechanicsType b : MechanicsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

