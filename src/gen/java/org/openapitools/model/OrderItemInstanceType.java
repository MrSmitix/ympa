package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
 */
public enum OrderItemInstanceType {
  
  CIS("CIS"),
  
  UIN("UIN"),
  
  RNPT("RNPT"),
  
  GTD("GTD");

  private String value;

  OrderItemInstanceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderItemInstanceType fromValue(String text) {
    for (OrderItemInstanceType b : OrderItemInstanceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


