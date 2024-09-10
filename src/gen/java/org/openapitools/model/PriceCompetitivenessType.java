package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 */
public enum PriceCompetitivenessType {
  
  OPTIMAL("OPTIMAL"),
  
  AVERAGE("AVERAGE"),
  
  LOW("LOW");

  private String value;

  PriceCompetitivenessType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PriceCompetitivenessType fromValue(String value) {
    for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

