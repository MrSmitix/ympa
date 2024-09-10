package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static OfferMappingKindType fromValue(String text) {
    for (OfferMappingKindType b : OfferMappingKindType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

