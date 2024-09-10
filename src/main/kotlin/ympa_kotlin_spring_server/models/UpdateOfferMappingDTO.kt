package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdateMappingDTO
import ympa_kotlin_spring_server.models.UpdateOfferDTO
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
 * Информация о товаре.
 * @param offer 
 * @param mapping 
 */
data class UpdateOfferMappingDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("offer", required = true) val offer: UpdateOfferDTO,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mapping") val mapping: UpdateMappingDTO? = null
    ) {

}

