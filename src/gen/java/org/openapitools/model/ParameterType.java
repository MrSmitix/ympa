/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
 */
public enum ParameterType {
  
  TEXT("TEXT"),
  
  ENUM("ENUM"),
  
  BOOLEAN("BOOLEAN"),
  
  NUMERIC("NUMERIC");

  private String value;

  ParameterType(String value) {
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

  @JsonCreator
  public static ParameterType fromValue(String value) {
    for (ParameterType b : ParameterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

