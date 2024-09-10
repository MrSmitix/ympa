package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Статус передачи возврата:  * &#x60;CREATED&#x60; — возврат создан.  * &#x60;RECEIVED&#x60; — принят у покупателя.  * &#x60;IN_TRANSIT&#x60; — возврат в пути.  * &#x60;READY_FOR_PICKUP&#x60; — возврат готов к выдаче магазину.  * &#x60;PICKED&#x60; — возврат выдан магазину.  * &#x60;LOST&#x60; — возврат утерян при транспортировке.  * &#x60;CANCELLED&#x60; — возврат отменен.  * &#x60;FULFILMENT_RECEIVED&#x60; — возврат принят на складе Маркета.  * &#x60;PREPARED_FOR_UTILIZATION&#x60; — возврат передан в утилизацию.  * &#x60;UTILIZED&#x60; — возврат утилизирован. 
 */
public enum ReturnShipmentStatusType {
  
  CREATED("CREATED"),
  
  RECEIVED("RECEIVED"),
  
  IN_TRANSIT("IN_TRANSIT"),
  
  READY_FOR_PICKUP("READY_FOR_PICKUP"),
  
  PICKED("PICKED"),
  
  LOST("LOST"),
  
  EXPIRED("EXPIRED"),
  
  CANCELLED("CANCELLED"),
  
  FULFILMENT_RECEIVED("FULFILMENT_RECEIVED"),
  
  PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
  
  NOT_IN_DEMAND("NOT_IN_DEMAND"),
  
  UTILIZED("UTILIZED"),
  
  READY_FOR_EXPROPRIATION("READY_FOR_EXPROPRIATION"),
  
  RECEIVED_FOR_EXPROPRIATION("RECEIVED_FOR_EXPROPRIATION");

  private String value;

  ReturnShipmentStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReturnShipmentStatusType fromValue(String value) {
    for (ReturnShipmentStatusType b : ReturnShipmentStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

