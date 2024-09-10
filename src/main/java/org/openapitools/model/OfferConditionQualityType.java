package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

