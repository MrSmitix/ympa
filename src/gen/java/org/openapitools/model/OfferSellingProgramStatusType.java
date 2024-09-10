package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 */
public enum OfferSellingProgramStatusType {
  
  FINE("FINE"),
  
  REJECT("REJECT");

  private String value;

  OfferSellingProgramStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferSellingProgramStatusType fromValue(String text) {
    for (OfferSellingProgramStatusType b : OfferSellingProgramStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


