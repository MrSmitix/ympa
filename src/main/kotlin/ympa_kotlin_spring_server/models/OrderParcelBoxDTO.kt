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
 * Информация о грузоместе.
 * @param id Идентификатор грузоместа.
 * @param fulfilmentId Идентификатор грузового места в информационной системе магазина.
 */
data class OrderParcelBoxDTO(

    @Schema(example = "null", description = "Идентификатор грузоместа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор грузового места в информационной системе магазина.")
    @get:JsonProperty("fulfilmentId") val fulfilmentId: kotlin.String? = null
    ) {

}

