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
 * Значение характеристики.
 * @param id Идентификатор значения.
 * @param &#x60;value&#x60; Значение.
 * @param description Описание значения.
 */
data class ParameterValueOptionDTO(

    @Schema(example = "null", required = true, description = "Идентификатор значения.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "null", required = true, description = "Значение.")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(example = "null", description = "Описание значения.")
    @get:JsonProperty("description") val description: kotlin.String? = null
    ) {

}

