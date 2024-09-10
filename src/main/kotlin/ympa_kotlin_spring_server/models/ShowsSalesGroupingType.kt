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
* Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
* Values: CATEGORIES,OFFERS
*/
enum class ShowsSalesGroupingType(@get:JsonValue val value: kotlin.String) {

    CATEGORIES("CATEGORIES"),
    OFFERS("OFFERS");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ShowsSalesGroupingType {
                return values().first{it -> it.value == value}
        }
    }
}

