package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 */
public enum EacVerificationStatusType {
  
  ACCEPTED("ACCEPTED"),
  
  REJECTED("REJECTED"),
  
  NEED_UPDATE("NEED_UPDATE");

  private String value;

  EacVerificationStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EacVerificationStatusType fromValue(String value) {
    for (EacVerificationStatusType b : EacVerificationStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

