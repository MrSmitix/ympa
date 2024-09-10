package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */
public enum ReportFormatType {
  
  FILE("FILE"),
  
  CSV("CSV");

  private String value;

  ReportFormatType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportFormatType fromValue(String value) {
    for (ReportFormatType b : ReportFormatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

