package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 */
public enum OfferSellingProgramStatusType {
  
  FINE("FINE"),
  
  REJECT("REJECT");

  private String value;

  OfferSellingProgramStatusType(String value) {
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

  public static OfferSellingProgramStatusType fromValue(String value) {
    for (OfferSellingProgramStatusType b : OfferSellingProgramStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}