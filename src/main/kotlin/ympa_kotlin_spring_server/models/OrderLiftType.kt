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
* Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. 
* Values: NOT_NEEDED,MANUAL,ELEVATOR,CARGO_ELEVATOR,FREE,UNKNOWN
*/
enum class OrderLiftType(@get:JsonValue val value: kotlin.String) {

    NOT_NEEDED("NOT_NEEDED"),
    MANUAL("MANUAL"),
    ELEVATOR("ELEVATOR"),
    CARGO_ELEVATOR("CARGO_ELEVATOR"),
    FREE("FREE"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderLiftType {
                return values().first{it -> it.value == value}
        }
    }
}

