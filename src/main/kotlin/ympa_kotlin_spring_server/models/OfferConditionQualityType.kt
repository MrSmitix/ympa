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
* Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
* Values: PERFECT,EXCELLENT,GOOD,NOT_SPECIFIED
*/
enum class OfferConditionQualityType(@get:JsonValue val value: kotlin.String) {

    PERFECT("PERFECT"),
    EXCELLENT("EXCELLENT"),
    GOOD("GOOD"),
    NOT_SPECIFIED("NOT_SPECIFIED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferConditionQualityType {
                return values().first{it -> it.value == value}
        }
    }
}

