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
* Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
* Values: FBY,FBS,DBS,EXPRESS
*/
enum class SellingProgramType(@get:JsonValue val value: kotlin.String) {

    FBY("FBY"),
    FBS("FBS"),
    DBS("DBS"),
    EXPRESS("EXPRESS");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): SellingProgramType {
                return values().first{it -> it.value == value}
        }
    }
}

