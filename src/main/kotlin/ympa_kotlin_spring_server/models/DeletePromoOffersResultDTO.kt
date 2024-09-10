package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.RejectedPromoOfferDeleteDTO
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
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 * @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
 */
data class DeletePromoOffersResultDTO(

    @field:Valid
    @Schema(example = "null", description = "Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. ")
    @get:JsonProperty("rejectedOffers") val rejectedOffers: kotlin.collections.List<RejectedPromoOfferDeleteDTO>? = null
    ) {

}

