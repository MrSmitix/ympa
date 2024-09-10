package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferConditionQualityType fromValue(String value) {
    for (OfferConditionQualityType b : OfferConditionQualityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}