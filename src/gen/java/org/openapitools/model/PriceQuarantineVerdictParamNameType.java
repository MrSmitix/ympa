package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Имя параметра причины скрытия товара по цене.  * &#x60;CURRENT_PRICE&#x60; — цена, из-за которой товар попал в карантин. * &#x60;LAST_VALID_PRICE&#x60; — последняя цена до попадания в карантин (только для карантина типа &#x60;PRICE_CHANGE&#x60;). * &#x60;MIN_PRICE&#x60; — порог попадания в карантин (только для карантина типов &#x60;LOW_PRICE&#x60; и &#x60;LOW_PRICE_PROMO&#x60;). * &#x60;CURRENCY&#x60; — валюта. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
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


