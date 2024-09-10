package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете. 
 */
public enum FeedIndexLogsIndexType {
  
  DIFF("DIFF"),
  
  FAST_PRICE("FAST_PRICE"),
  
  FULL("FULL");

  private String value;

  FeedIndexLogsIndexType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedIndexLogsIndexType fromValue(String value) {
    for (FeedIndexLogsIndexType b : FeedIndexLogsIndexType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

