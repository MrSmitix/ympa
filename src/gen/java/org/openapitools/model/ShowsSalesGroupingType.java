package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */
public enum ShowsSalesGroupingType {
  
  CATEGORIES("CATEGORIES"),
  
  OFFERS("OFFERS");

  private String value;

  ShowsSalesGroupingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShowsSalesGroupingType fromValue(String text) {
    for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


