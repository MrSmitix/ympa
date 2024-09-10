package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GetOfferMappingDTO
import ympa_kotlin_spring_server.models.ScrollingPagerDTO
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
 * Информация о товарах.
 * @param offerMappings Информация о товарах.
 * @param paging 
 */
data class GetOfferMappingsResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о товарах.")
    @get:JsonProperty("offerMappings", required = true) val offerMappings: kotlin.collections.List<GetOfferMappingDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

