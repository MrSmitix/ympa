package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
 */
public enum AddOffersToArchiveErrorType {
  
  OFFER_HAS_STOCKS("OFFER_HAS_STOCKS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AddOffersToArchiveErrorType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddOffersToArchiveErrorType fromValue(String value) {
    for (AddOffersToArchiveErrorType b : AddOffersToArchiveErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

