package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
* Values: CREATED,RECEIVED,IN_TRANSIT,READY_FOR_PICKUP,PICKED,LOST,EXPIRED,CANCELLED,FULFILMENT_RECEIVED,PREPARED_FOR_UTILIZATION,NOT_IN_DEMAND,UTILIZED,READY_FOR_EXPROPRIATION,RECEIVED_FOR_EXPROPRIATION
*/
enum class ReturnShipmentStatusType(@get:JsonValue val value: kotlin.String) {

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

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnShipmentStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

