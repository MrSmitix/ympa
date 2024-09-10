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
 * Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum FeedContentErrorType {
  
  PARSE_ERROR("PARSE_ERROR"),
  
  PARSE_XML_ERROR("PARSE_XML_ERROR"),
  
  TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS");

  private String value;

  FeedContentErrorType(String value) {
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
  public static FeedContentErrorType fromValue(String value) {
    for (FeedContentErrorType b : FeedContentErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

