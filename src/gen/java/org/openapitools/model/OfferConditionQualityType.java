package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferConditionQualityType fromValue(String value) {
    for (OfferConditionQualityType b : OfferConditionQualityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

