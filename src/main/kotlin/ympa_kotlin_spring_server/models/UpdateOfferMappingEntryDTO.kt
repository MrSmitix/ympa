package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OfferMappingDTO
import ympa_kotlin_spring_server.models.UpdateMappingsOfferDTO
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
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 * @param mapping 
 * @param awaitingModerationMapping 
 * @param rejectedMapping 
 * @param offer 
 */
data class UpdateOfferMappingEntryDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mapping") val mapping: OfferMappingDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("awaitingModerationMapping") val awaitingModerationMapping: OfferMappingDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rejectedMapping") val rejectedMapping: OfferMappingDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offer") val offer: UpdateMappingsOfferDTO? = null
    ) {

}

