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
 * Служба доставки.
 * @param id Идентификатор службы доставки.
 * @param name Наименование службы доставки.
 */
data class DeliveryServiceDTO(

    @Schema(example = "null", description = "Идентификатор службы доставки.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Наименование службы доставки.")
    @get:JsonProperty("name") val name: kotlin.String? = null
    ) {

}
