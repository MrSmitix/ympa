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
* Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. 
* Values: OUTBOUND_CREATED,OUTBOUND_READY_FOR_CONFIRMATION,OUTBOUND_CONFIRMED,OUTBOUND_SIGNED,FINISHED,ACCEPTED,ACCEPTED_WITH_DISCREPANCIES,ERROR
*/
enum class ShipmentStatusType(@get:JsonValue val value: kotlin.String) {

    OUTBOUND_CREATED("OUTBOUND_CREATED"),
    OUTBOUND_READY_FOR_CONFIRMATION("OUTBOUND_READY_FOR_CONFIRMATION"),
    OUTBOUND_CONFIRMED("OUTBOUND_CONFIRMED"),
    OUTBOUND_SIGNED("OUTBOUND_SIGNED"),
    FINISHED("FINISHED"),
    ACCEPTED("ACCEPTED"),
    ACCEPTED_WITH_DISCREPANCIES("ACCEPTED_WITH_DISCREPANCIES"),
    ERROR("ERROR");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ShipmentStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

