package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 */
public enum ReportSubStatusType {
  
  NO_DATA("NO_DATA"),
  
  TOO_LARGE("TOO_LARGE"),
  
  RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND");

  private String value;

  ReportSubStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportSubStatusType fromValue(String value) {
    for (ReportSubStatusType b : ReportSubStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

