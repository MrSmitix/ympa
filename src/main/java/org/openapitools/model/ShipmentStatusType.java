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
 * Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum ShipmentStatusType {
  
  OUTBOUND_CREATED("OUTBOUND_CREATED"),
  
  OUTBOUND_READY_FOR_CONFIRMATION("OUTBOUND_READY_FOR_CONFIRMATION"),
  
  OUTBOUND_CONFIRMED("OUTBOUND_CONFIRMED"),
  
  OUTBOUND_SIGNED("OUTBOUND_SIGNED"),
  
  FINISHED("FINISHED"),
  
  ACCEPTED("ACCEPTED"),
  
  ACCEPTED_WITH_DISCREPANCIES("ACCEPTED_WITH_DISCREPANCIES"),
  
  ERROR("ERROR");

  private String value;

  ShipmentStatusType(String value) {
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
  public static ShipmentStatusType fromValue(String value) {
    for (ShipmentStatusType b : ShipmentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

