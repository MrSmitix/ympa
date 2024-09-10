package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 */
public enum LogisticPointType {
  
  WAREHOUSE("WAREHOUSE"),
  
  PICKUP_POINT("PICKUP_POINT"),
  
  PICKUP_TERMINAL("PICKUP_TERMINAL"),
  
  PICKUP_POST_OFFICE("PICKUP_POST_OFFICE"),
  
  PICKUP_MIXED("PICKUP_MIXED"),
  
  PICKUP_RETAIL("PICKUP_RETAIL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  LogisticPointType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LogisticPointType fromValue(String value) {
    for (LogisticPointType b : LogisticPointType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

