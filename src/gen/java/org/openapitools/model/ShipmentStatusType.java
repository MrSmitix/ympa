package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус отгрузки:  * &#x60;OUTBOUND_CREATED&#x60; — формируется. * &#x60;OUTBOUND_READY_FOR_CONFIRMATION&#x60; — можно обрабатывать. * &#x60;OUTBOUND_CONFIRMED&#x60; — подтверждена и готова к отправке. * &#x60;OUTBOUND_SIGNED&#x60; — по ней подписан электронный акт приема-передачи. * &#x60;ACCEPTED&#x60; — принята в сортировочном центре или пункте приема. * &#x60;ACCEPTED_WITH_DISCREPANCIES&#x60; — принята с расхождениями. * &#x60;FINISHED&#x60; — завершена. * &#x60;ERROR&#x60; — отменена из-за ошибки. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShipmentStatusType {

    @JsonProperty("OUTBOUND_CREATED") OUTBOUND_CREATED(String.valueOf("OUTBOUND_CREATED")), @JsonProperty("OUTBOUND_READY_FOR_CONFIRMATION") OUTBOUND_READY_FOR_CONFIRMATION(String.valueOf("OUTBOUND_READY_FOR_CONFIRMATION")), @JsonProperty("OUTBOUND_CONFIRMED") OUTBOUND_CONFIRMED(String.valueOf("OUTBOUND_CONFIRMED")), @JsonProperty("OUTBOUND_SIGNED") OUTBOUND_SIGNED(String.valueOf("OUTBOUND_SIGNED")), @JsonProperty("FINISHED") FINISHED(String.valueOf("FINISHED")), @JsonProperty("ACCEPTED") ACCEPTED(String.valueOf("ACCEPTED")), @JsonProperty("ACCEPTED_WITH_DISCREPANCIES") ACCEPTED_WITH_DISCREPANCIES(String.valueOf("ACCEPTED_WITH_DISCREPANCIES")), @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));


    private String value;

    ShipmentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShipmentStatusType fromValue(String value) {
        for (ShipmentStatusType b : ShipmentStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



