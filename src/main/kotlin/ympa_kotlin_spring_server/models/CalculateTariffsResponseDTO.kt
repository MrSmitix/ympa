package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CalculateTariffsOfferInfoDTO
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
 * Расчет стоимости услуг.
 * @param offers Стоимость услуг.
 */
data class CalculateTariffsResponseDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Стоимость услуг.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<CalculateTariffsOfferInfoDTO>
    ) {

}

