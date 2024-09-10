package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 */
public enum ShowsSalesGroupingType {
  
  CATEGORIES("CATEGORIES"),
  
  OFFERS("OFFERS");

  private String value;

  ShowsSalesGroupingType(String value) {
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

  public static ShowsSalesGroupingType fromValue(String value) {
    for (ShowsSalesGroupingType b : ShowsSalesGroupingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}