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
* Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
* Values: PAYMENT,REFUND,UNKNOWN
*/
enum class OrdersStatsPaymentType(@get:JsonValue val value: kotlin.String) {

    PAYMENT("PAYMENT"),
    REFUND("REFUND"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrdersStatsPaymentType {
                return values().first{it -> it.value == value}
        }
    }
}

