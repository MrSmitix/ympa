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
* Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
* Values: CONFIRM,DOWNLOAD_ACT,DOWNLOAD_INBOUND_ACT,DOWNLOAD_DISCREPANCY_ACT,CHANGE_PALLETS_COUNT
*/
enum class ShipmentActionType(@get:JsonValue val value: kotlin.String) {

    CONFIRM("CONFIRM"),
    DOWNLOAD_ACT("DOWNLOAD_ACT"),
    DOWNLOAD_INBOUND_ACT("DOWNLOAD_INBOUND_ACT"),
    DOWNLOAD_DISCREPANCY_ACT("DOWNLOAD_DISCREPANCY_ACT"),
    CHANGE_PALLETS_COUNT("CHANGE_PALLETS_COUNT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ShipmentActionType {
                return values().first{it -> it.value == value}
        }
    }
}

