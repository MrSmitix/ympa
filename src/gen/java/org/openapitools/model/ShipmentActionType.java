package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Действия с отгрузкой:  * &#x60;CONFIRM&#x60; — подтвердить отгрузку. * &#x60;DOWNLOAD_ACT&#x60; — скачать акт приема-передачи отгрузки. * &#x60;DOWNLOAD_INBOUND_ACT&#x60; — скачать список принятых заказов. * &#x60;DOWNLOAD_DISCREPANCY_ACT&#x60; — скачать акт расхождений. * &#x60;CHANGE_PALLETS_COUNT&#x60; — указать количество палет. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShipmentActionType {

    @JsonProperty("CONFIRM") CONFIRM(String.valueOf("CONFIRM")), @JsonProperty("DOWNLOAD_ACT") DOWNLOAD_ACT(String.valueOf("DOWNLOAD_ACT")), @JsonProperty("DOWNLOAD_INBOUND_ACT") DOWNLOAD_INBOUND_ACT(String.valueOf("DOWNLOAD_INBOUND_ACT")), @JsonProperty("DOWNLOAD_DISCREPANCY_ACT") DOWNLOAD_DISCREPANCY_ACT(String.valueOf("DOWNLOAD_DISCREPANCY_ACT")), @JsonProperty("CHANGE_PALLETS_COUNT") CHANGE_PALLETS_COUNT(String.valueOf("CHANGE_PALLETS_COUNT"));


    private String value;

    ShipmentActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
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



