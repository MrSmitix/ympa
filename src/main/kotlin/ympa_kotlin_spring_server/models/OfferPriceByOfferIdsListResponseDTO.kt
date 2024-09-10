package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OfferPriceByOfferIdsResponseDTO
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
 * Список цен.
 * @param offers Страница списка цен.
 * @param paging 
 */
data class OfferPriceByOfferIdsListResponseDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Страница списка цен.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<OfferPriceByOfferIdsResponseDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

