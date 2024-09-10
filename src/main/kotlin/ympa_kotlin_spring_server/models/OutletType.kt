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
* Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
* Values: DEPOT,MIXED,RETAIL,NOT_DEFINED
*/
enum class OutletType(@get:JsonValue val value: kotlin.String) {

    DEPOT("DEPOT"),
    MIXED("MIXED"),
    RETAIL("RETAIL"),
    NOT_DEFINED("NOT_DEFINED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OutletType {
                return values().first{it -> it.value == value}
        }
    }
}

