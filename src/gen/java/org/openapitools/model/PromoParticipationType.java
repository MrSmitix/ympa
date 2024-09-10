package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */
public enum PromoParticipationType {
  
  PARTICIPATING_NOW("PARTICIPATING_NOW"),
  
  PARTICIPATED("PARTICIPATED");

  private String value;

  PromoParticipationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromoParticipationType fromValue(String value) {
    for (PromoParticipationType b : PromoParticipationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

