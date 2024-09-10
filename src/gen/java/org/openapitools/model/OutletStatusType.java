package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */
public enum OutletStatusType {
  
  AT_MODERATION("AT_MODERATION"),
  
  FAILED("FAILED"),
  
  MODERATED("MODERATED"),
  
  NONMODERATED("NONMODERATED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OutletStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutletStatusType fromValue(String value) {
    for (OutletStatusType b : OutletStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

