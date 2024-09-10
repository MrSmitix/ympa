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
* Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
* Values: PARTNER,CUSTOMER,MARKET,SUPPORT
*/
enum class ChatMessageSenderType(@get:JsonValue val value: kotlin.String) {

    PARTNER("PARTNER"),
    CUSTOMER("CUSTOMER"),
    MARKET("MARKET"),
    SUPPORT("SUPPORT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ChatMessageSenderType {
                return values().first{it -> it.value == value}
        }
    }
}
