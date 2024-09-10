package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CalculateTariffsOfferDTO
import ympa_kotlin_spring_server.models.CalculateTariffsParametersDTO
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
 * 
 * @param parameters 
 * @param offers Товары, для которых нужно рассчитать стоимость услуг.
 */
data class CalculateTariffsRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("parameters", required = true) val parameters: CalculateTariffsParametersDTO,

    @field:Valid
    @get:Size(min=1,max=200) 
    @Schema(example = "null", required = true, description = "Товары, для которых нужно рассчитать стоимость услуг.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<CalculateTariffsOfferDTO>
    ) {

}

