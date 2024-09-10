package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 */
public enum LicenseType {
  
  ALCOHOL("ALCOHOL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  LicenseType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LicenseType fromValue(String value) {
    for (LicenseType b : LicenseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

