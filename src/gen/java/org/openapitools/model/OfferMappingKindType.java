package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Вид маппинга.
 */
public enum OfferMappingKindType {
  
  ACTIVE("ACTIVE"),
  
  ALL("ALL");

  private String value;

  OfferMappingKindType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferMappingKindType fromValue(String value) {
    for (OfferMappingKindType b : OfferMappingKindType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

