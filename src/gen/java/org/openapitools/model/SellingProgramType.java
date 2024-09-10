package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
 */
public enum SellingProgramType {
  
  FBY("FBY"),
  
  FBS("FBS"),
  
  DBS("DBS"),
  
  EXPRESS("EXPRESS");

  private String value;

  SellingProgramType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SellingProgramType fromValue(String text) {
    for (SellingProgramType b : SellingProgramType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


