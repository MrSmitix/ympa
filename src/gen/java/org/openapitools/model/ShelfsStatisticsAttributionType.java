package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип атрибуции:   * &#x60;CLICKS&#x60; — по кликам.   * &#x60;SHOWS&#x60; — по показам. &lt;br&gt;&lt;br&gt;  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */
public enum ShelfsStatisticsAttributionType {
  
  CLICKS("CLICKS"),
  
  SHOWS("SHOWS");

  private String value;

  ShelfsStatisticsAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShelfsStatisticsAttributionType fromValue(String value) {
    for (ShelfsStatisticsAttributionType b : ShelfsStatisticsAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

