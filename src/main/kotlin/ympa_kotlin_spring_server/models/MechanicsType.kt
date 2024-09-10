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
* Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
* Values: DIRECT_DISCOUNT,BLUE_FLASH,MARKET_PROMOCODE
*/
enum class MechanicsType(@get:JsonValue val value: kotlin.String) {

    DIRECT_DISCOUNT("DIRECT_DISCOUNT"),
    BLUE_FLASH("BLUE_FLASH"),
    MARKET_PROMOCODE("MARKET_PROMOCODE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MechanicsType {
                return values().first{it -> it.value == value}
        }
    }
}

