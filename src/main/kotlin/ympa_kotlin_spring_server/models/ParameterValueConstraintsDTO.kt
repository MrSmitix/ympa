package ympa_kotlin_spring_server.models

import java.util.Objects
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
 * Ограничения на значения характеристик.
 * @param minValue Минимальное число.
 * @param maxValue Максимальное число.
 * @param maxLength Максимальная длина текста.
 */
data class ParameterValueConstraintsDTO(

    @Schema(example = "null", description = "Минимальное число.")
    @get:JsonProperty("minValue") val minValue: kotlin.Double? = null,

    @Schema(example = "null", description = "Максимальное число.")
    @get:JsonProperty("maxValue") val maxValue: kotlin.Double? = null,

    @Schema(example = "null", description = "Максимальная длина текста.")
    @get:JsonProperty("maxLength") val maxLength: kotlin.Int? = null
    ) {

}

