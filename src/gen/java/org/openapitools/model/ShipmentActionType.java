package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Действия с отгрузкой:  * &#x60;CONFIRM&#x60; — подтвердить отгрузку. * &#x60;DOWNLOAD_ACT&#x60; — скачать акт приема-передачи отгрузки. * &#x60;DOWNLOAD_INBOUND_ACT&#x60; — скачать список принятых заказов. * &#x60;DOWNLOAD_DISCREPANCY_ACT&#x60; — скачать акт расхождений. * &#x60;CHANGE_PALLETS_COUNT&#x60; — указать количество палет. 
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
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentActionType fromValue(String value) {
    for (ShipmentActionType b : ShipmentActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

