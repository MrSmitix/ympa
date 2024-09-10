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
 * Запрос на передачу количества упаковок в отгрузке.
 * @param placesCount Количество упаковок в отгрузке.
 */
data class SetShipmentPalletsCountRequest(

    @get:Min(0)
    @Schema(example = "null", required = true, description = "Количество упаковок в отгрузке.")
    @get:JsonProperty("placesCount", required = true) val placesCount: kotlin.Int
    ) {

}
