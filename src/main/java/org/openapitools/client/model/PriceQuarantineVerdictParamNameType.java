/**
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

package org.openapitools.client.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Имя параметра причины скрытия товара по цене.  * &#x60;CURRENT_PRICE&#x60; — цена, из-за которой товар попал в карантин. * &#x60;LAST_VALID_PRICE&#x60; — последняя цена до попадания в карантин (только для карантина типа &#x60;PRICE_CHANGE&#x60;). * &#x60;MIN_PRICE&#x60; — порог попадания в карантин (только для карантина типов &#x60;LOW_PRICE&#x60; и &#x60;LOW_PRICE_PROMO&#x60;). * &#x60;CURRENCY&#x60; — валюта. 
 */
public enum PriceQuarantineVerdictParamNameType {
  
  CURRENT_PRICE("CURRENT_PRICE"),
  
  LAST_VALID_PRICE("LAST_VALID_PRICE"),
  
  MIN_PRICE("MIN_PRICE"),
  
  CURRENCY("CURRENCY");

  private String value;

  PriceQuarantineVerdictParamNameType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriceQuarantineVerdictParamNameType fromValue(String text) {
    for (PriceQuarantineVerdictParamNameType b : PriceQuarantineVerdictParamNameType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

