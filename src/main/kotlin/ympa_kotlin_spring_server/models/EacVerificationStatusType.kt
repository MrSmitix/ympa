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
* Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
* Values: ACCEPTED,REJECTED,NEED_UPDATE
*/
enum class EacVerificationStatusType(@get:JsonValue val value: kotlin.String) {

    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED"),
    NEED_UPDATE("NEED_UPDATE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): EacVerificationStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

