package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Вид маппинга.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
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