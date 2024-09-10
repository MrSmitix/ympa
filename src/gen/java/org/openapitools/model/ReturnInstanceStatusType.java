package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Логистический статус конкретного товара.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnInstanceStatusType {

    @JsonProperty("CREATED") CREATED(String.valueOf("CREATED")), @JsonProperty("RECEIVED") RECEIVED(String.valueOf("RECEIVED")), @JsonProperty("IN_TRANSIT") IN_TRANSIT(String.valueOf("IN_TRANSIT")), @JsonProperty("READY_FOR_PICKUP") READY_FOR_PICKUP(String.valueOf("READY_FOR_PICKUP")), @JsonProperty("PICKED") PICKED(String.valueOf("PICKED")), @JsonProperty("RECEIVED_ON_FULFILLMENT") RECEIVED_ON_FULFILLMENT(String.valueOf("RECEIVED_ON_FULFILLMENT")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @JsonProperty("LOST") LOST(String.valueOf("LOST")), @JsonProperty("UTILIZED") UTILIZED(String.valueOf("UTILIZED")), @JsonProperty("PREPARED_FOR_UTILIZATION") PREPARED_FOR_UTILIZATION(String.valueOf("PREPARED_FOR_UTILIZATION")), @JsonProperty("EXPROPRIATED") EXPROPRIATED(String.valueOf("EXPROPRIATED")), @JsonProperty("NOT_IN_DEMAND") NOT_IN_DEMAND(String.valueOf("NOT_IN_DEMAND"));


    private String value;

    ReturnInstanceStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnInstanceStatusType fromValue(String value) {
        for (ReturnInstanceStatusType b : ReturnInstanceStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



