package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 */
public enum ShipmentPalletLabelPageFormatType {
  
  A4("A4"),
  
  A8("A8");

  private String value;

  ShipmentPalletLabelPageFormatType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShipmentPalletLabelPageFormatType fromValue(String text) {
    for (ShipmentPalletLabelPageFormatType b : ShipmentPalletLabelPageFormatType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


