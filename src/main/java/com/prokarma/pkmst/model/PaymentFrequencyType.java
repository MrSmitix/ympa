package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 */
public enum PaymentFrequencyType {
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  MONTHLY("MONTHLY");

  private String value;

  PaymentFrequencyType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentFrequencyType fromValue(String text) {
    for (PaymentFrequencyType b : PaymentFrequencyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

