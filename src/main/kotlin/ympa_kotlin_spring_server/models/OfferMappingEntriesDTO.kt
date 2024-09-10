package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OfferMappingEntryDTO
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
 * Информация о товарах в каталоге.
 * @param offerMappingEntries Информация о товарах в каталоге.
 * @param paging 
 */
data class OfferMappingEntriesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о товарах в каталоге.")
    @get:JsonProperty("offerMappingEntries", required = true) val offerMappingEntries: kotlin.collections.List<OfferMappingEntryDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

