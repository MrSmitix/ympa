package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
 */
public enum FeedbackDeliveryType {
  
  DELIVERY("DELIVERY"),
  
  PICKUP("PICKUP"),
  
  INSTORE("INSTORE");

  private String value;

  FeedbackDeliveryType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedbackDeliveryType fromValue(String value) {
    for (FeedbackDeliveryType b : FeedbackDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

