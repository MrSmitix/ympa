package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. 
 */
public enum FeedIndexLogsStatusType {
  
  ERROR("ERROR"),
  
  OK("OK"),
  
  WARNING("WARNING");

  private String value;

  FeedIndexLogsStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedIndexLogsStatusType fromValue(String value) {
    for (FeedIndexLogsStatusType b : FeedIndexLogsStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

