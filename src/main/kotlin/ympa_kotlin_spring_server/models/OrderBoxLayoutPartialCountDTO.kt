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
 * Информация о части товара в коробке.
 * @param current Номер части, начиная с 1.
 * @param total На сколько всего частей разделен товар.
 */
data class OrderBoxLayoutPartialCountDTO(

    @get:Min(1)
    @Schema(example = "null", required = true, description = "Номер части, начиная с 1.")
    @get:JsonProperty("current", required = true) val current: kotlin.Int,

    @get:Min(2)
    @Schema(example = "null", required = true, description = "На сколько всего частей разделен товар.")
    @get:JsonProperty("total", required = true) val total: kotlin.Int
    ) {

}

