package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */
public enum RejectedPromoOfferDeleteReasonType {
  
  OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

  private String value;

  RejectedPromoOfferDeleteReasonType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RejectedPromoOfferDeleteReasonType fromValue(String value) {
    for (RejectedPromoOfferDeleteReasonType b : RejectedPromoOfferDeleteReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

