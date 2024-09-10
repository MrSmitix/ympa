package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GetMappingDTO
import ympa_kotlin_spring_server.models.SuggestedOfferDTO
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
 * Товар с соответствующей карточкой на Маркете.
 * @param offer 
 * @param mapping 
 */
data class SuggestedOfferMappingDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offer") val offer: SuggestedOfferDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mapping") val mapping: GetMappingDTO? = null
    ) {

}

