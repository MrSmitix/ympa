package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
 */
public enum ReportStatusType {
  
  PENDING("PENDING"),
  
  PROCESSING("PROCESSING"),
  
  FAILED("FAILED"),
  
  DONE("DONE");

  private String value;

  ReportStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportStatusType fromValue(String text) {
    for (ReportStatusType b : ReportStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

