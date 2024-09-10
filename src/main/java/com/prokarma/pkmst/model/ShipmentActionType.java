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
 * Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
 */
public enum ShipmentActionType {
  
  CONFIRM("CONFIRM"),
  
  DOWNLOAD_ACT("DOWNLOAD_ACT"),
  
  DOWNLOAD_INBOUND_ACT("DOWNLOAD_INBOUND_ACT"),
  
  DOWNLOAD_DISCREPANCY_ACT("DOWNLOAD_DISCREPANCY_ACT"),
  
  CHANGE_PALLETS_COUNT("CHANGE_PALLETS_COUNT");

  private String value;

  ShipmentActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShipmentActionType fromValue(String text) {
    for (ShipmentActionType b : ShipmentActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

