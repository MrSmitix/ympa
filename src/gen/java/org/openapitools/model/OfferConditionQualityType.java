package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 */
public enum OfferConditionQualityType {
  
  PERFECT("PERFECT"),
  
  EXCELLENT("EXCELLENT"),
  
  GOOD("GOOD"),
  
  NOT_SPECIFIED("NOT_SPECIFIED");

  private String value;

  OfferConditionQualityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferConditionQualityType fromValue(String text) {
    for (OfferConditionQualityType b : OfferConditionQualityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


