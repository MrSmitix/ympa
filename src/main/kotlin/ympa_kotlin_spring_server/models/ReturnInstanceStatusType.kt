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
* Логистический статус конкретного товара.
* Values: CREATED,RECEIVED,IN_TRANSIT,READY_FOR_PICKUP,PICKED,RECEIVED_ON_FULFILLMENT,CANCELLED,LOST,UTILIZED,PREPARED_FOR_UTILIZATION,EXPROPRIATED,NOT_IN_DEMAND
*/
enum class ReturnInstanceStatusType(@get:JsonValue val value: kotlin.String) {

    CREATED("CREATED"),
    RECEIVED("RECEIVED"),
    IN_TRANSIT("IN_TRANSIT"),
    READY_FOR_PICKUP("READY_FOR_PICKUP"),
    PICKED("PICKED"),
    RECEIVED_ON_FULFILLMENT("RECEIVED_ON_FULFILLMENT"),
    CANCELLED("CANCELLED"),
    LOST("LOST"),
    UTILIZED("UTILIZED"),
    PREPARED_FOR_UTILIZATION("PREPARED_FOR_UTILIZATION"),
    EXPROPRIATED("EXPROPRIATED"),
    NOT_IN_DEMAND("NOT_IN_DEMAND");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnInstanceStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

