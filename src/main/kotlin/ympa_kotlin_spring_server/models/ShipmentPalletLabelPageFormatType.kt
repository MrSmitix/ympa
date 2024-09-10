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
* Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
* Values: A4,A8
*/
enum class ShipmentPalletLabelPageFormatType(@get:JsonValue val value: kotlin.String) {

    A4("A4"),
    A8("A8");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ShipmentPalletLabelPageFormatType {
                return values().first{it -> it.value == value}
        }
    }
}

