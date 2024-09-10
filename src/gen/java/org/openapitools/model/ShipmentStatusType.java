package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус отгрузки:  * &#x60;OUTBOUND_CREATED&#x60; — формируется. * &#x60;OUTBOUND_READY_FOR_CONFIRMATION&#x60; — можно обрабатывать. * &#x60;OUTBOUND_CONFIRMED&#x60; — подтверждена и готова к отправке. * &#x60;OUTBOUND_SIGNED&#x60; — по ней подписан электронный акт приема-передачи. * &#x60;ACCEPTED&#x60; — принята в сортировочном центре или пункте приема. * &#x60;ACCEPTED_WITH_DISCREPANCIES&#x60; — принята с расхождениями. * &#x60;FINISHED&#x60; — завершена. * &#x60;ERROR&#x60; — отменена из-за ошибки. 
 */
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

  @Override
  @JsonValue
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

