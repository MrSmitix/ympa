package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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