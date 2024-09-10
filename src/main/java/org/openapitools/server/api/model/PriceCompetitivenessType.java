package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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