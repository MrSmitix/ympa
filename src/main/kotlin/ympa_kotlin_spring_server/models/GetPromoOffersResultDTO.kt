package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_spring_server.models.GetPromoOfferDTO
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
 * Список товаров, которые участвуют или могут участвовать в акции.
 * @param offers Товары, которые участвуют или могут участвовать в акции.
 * @param paging 
 */
data class GetPromoOffersResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Товары, которые участвуют или могут участвовать в акции.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<GetPromoOfferDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}

