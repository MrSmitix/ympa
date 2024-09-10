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
 * Запрос для подтверждения отгрузки.
 * @param externalShipmentId Идентификатор отгрузки в системе поставщика.
 */
data class ConfirmShipmentRequest(

    @Schema(example = "null", description = "Идентификатор отгрузки в системе поставщика.")
    @get:JsonProperty("externalShipmentId") val externalShipmentId: kotlin.String? = null
    ) {

}

