package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriceCompetitivenessType fromValue(String text) {
    for (PriceCompetitivenessType b : PriceCompetitivenessType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


