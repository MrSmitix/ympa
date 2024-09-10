package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.RejectedPromoOfferUpdateDTO
import ympa_kotlin_spring_server.models.WarningPromoOfferUpdateDTO
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
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 * @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
 * @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
 */
data class UpdatePromoOffersResultDTO(

    @field:Valid
    @Schema(example = "null", description = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ")
    @get:JsonProperty("rejectedOffers") val rejectedOffers: kotlin.collections.List<RejectedPromoOfferUpdateDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ")
    @get:JsonProperty("warningOffers") val warningOffers: kotlin.collections.List<WarningPromoOfferUpdateDTO>? = null
    ) {

}

