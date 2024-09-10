package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum ReportSubStatusType {
  
  NO_DATA("NO_DATA"),
  
  TOO_LARGE("TOO_LARGE"),
  
  RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND");

  private String value;

  ReportSubStatusType(String value) {
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

  @JsonCreator
  public static ReportSubStatusType fromValue(String value) {
    for (ReportSubStatusType b : ReportSubStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

