package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 */
public enum ShipmentPalletLabelPageFormatType {
  
  A4("A4"),
  
  A8("A8");

  private String value;

  ShipmentPalletLabelPageFormatType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentPalletLabelPageFormatType fromValue(String value) {
    for (ShipmentPalletLabelPageFormatType b : ShipmentPalletLabelPageFormatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

