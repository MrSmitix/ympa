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
* Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
* Values: PARTICIPATING_NOW,PARTICIPATED
*/
enum class PromoParticipationType(@get:JsonValue val value: kotlin.String) {

    PARTICIPATING_NOW("PARTICIPATING_NOW"),
    PARTICIPATED("PARTICIPATED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PromoParticipationType {
                return values().first{it -> it.value == value}
        }
    }
}

