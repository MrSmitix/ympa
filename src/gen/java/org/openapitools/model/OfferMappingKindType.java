package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferMappingKindType fromValue(String value) {
    for (OfferMappingKindType b : OfferMappingKindType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

