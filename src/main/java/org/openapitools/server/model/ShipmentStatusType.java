package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. 
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

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ShipmentStatusType fromValue(String text) {
        for (ShipmentStatusType b : ShipmentStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

