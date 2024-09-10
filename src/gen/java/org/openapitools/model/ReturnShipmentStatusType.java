package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус передачи возврата:  * &#x60;CREATED&#x60; — возврат создан.  * &#x60;RECEIVED&#x60; — принят у покупателя.  * &#x60;IN_TRANSIT&#x60; — возврат в пути.  * &#x60;READY_FOR_PICKUP&#x60; — возврат готов к выдаче магазину.  * &#x60;PICKED&#x60; — возврат выдан магазину.  * &#x60;LOST&#x60; — возврат утерян при транспортировке.  * &#x60;CANCELLED&#x60; — возврат отменен.  * &#x60;FULFILMENT_RECEIVED&#x60; — возврат принят на складе Маркета.  * &#x60;PREPARED_FOR_UTILIZATION&#x60; — возврат передан в утилизацию.  * &#x60;UTILIZED&#x60; — возврат утилизирован. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnShipmentStatusType {

    @JsonProperty("CREATED") CREATED(String.valueOf("CREATED")), @JsonProperty("RECEIVED") RECEIVED(String.valueOf("RECEIVED")), @JsonProperty("IN_TRANSIT") IN_TRANSIT(String.valueOf("IN_TRANSIT")), @JsonProperty("READY_FOR_PICKUP") READY_FOR_PICKUP(String.valueOf("READY_FOR_PICKUP")), @JsonProperty("PICKED") PICKED(String.valueOf("PICKED")), @JsonProperty("LOST") LOST(String.valueOf("LOST")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @JsonProperty("FULFILMENT_RECEIVED") FULFILMENT_RECEIVED(String.valueOf("FULFILMENT_RECEIVED")), @JsonProperty("PREPARED_FOR_UTILIZATION") PREPARED_FOR_UTILIZATION(String.valueOf("PREPARED_FOR_UTILIZATION")), @JsonProperty("NOT_IN_DEMAND") NOT_IN_DEMAND(String.valueOf("NOT_IN_DEMAND")), @JsonProperty("UTILIZED") UTILIZED(String.valueOf("UTILIZED")), @JsonProperty("READY_FOR_EXPROPRIATION") READY_FOR_EXPROPRIATION(String.valueOf("READY_FOR_EXPROPRIATION")), @JsonProperty("RECEIVED_FOR_EXPROPRIATION") RECEIVED_FOR_EXPROPRIATION(String.valueOf("RECEIVED_FOR_EXPROPRIATION"));


    private String value;

    ReturnShipmentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
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



