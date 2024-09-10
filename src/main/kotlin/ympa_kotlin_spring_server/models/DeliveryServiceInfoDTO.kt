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
 * Информация о службе доставки.
 * @param id Идентификатор службы доставки.
 * @param name Наименование службы доставки.
 */
data class DeliveryServiceInfoDTO(

    @Schema(example = "null", required = true, description = "Идентификатор службы доставки.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "null", required = true, description = "Наименование службы доставки.")
    @get:JsonProperty("name", required = true) val name: kotlin.String
    ) {

}

