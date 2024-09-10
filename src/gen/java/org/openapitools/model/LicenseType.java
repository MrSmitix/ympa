package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
 */
public enum LicenseType {
  
  ALCOHOL("ALCOHOL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  LicenseType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LicenseType fromValue(String text) {
    for (LicenseType b : LicenseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


