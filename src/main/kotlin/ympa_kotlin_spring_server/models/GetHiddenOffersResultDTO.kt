package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.HiddenOfferDTO
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
 * Список скрытых вами товаров. 
 * @param hiddenOffers Список скрытых товаров.
 * @param paging 
 */
data class GetHiddenOffersResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список скрытых товаров.")
    @get:JsonProperty("hiddenOffers", required = true) val hiddenOffers: kotlin.collections.List<HiddenOfferDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

