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
 * Общий формат ошибки.
 * @param code Код ошибки.
 * @param message Описание ошибки.
 */
data class ApiErrorDTO(

    @Schema(example = "null", required = true, description = "Код ошибки.")
    @get:JsonProperty("code", required = true) val code: kotlin.String,

    @Schema(example = "null", description = "Описание ошибки.")
    @get:JsonProperty("message") val message: kotlin.String? = null
    ) {

}

