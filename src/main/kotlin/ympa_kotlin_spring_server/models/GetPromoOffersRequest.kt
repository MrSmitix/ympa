package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.PromoOfferParticipationStatusFilterType
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
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 * @param promoId Идентификатор акции.
 * @param statusType 
 */
data class GetPromoOffersRequest(

    @Schema(example = "null", required = true, description = "Идентификатор акции.")
    @get:JsonProperty("promoId", required = true) val promoId: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("statusType") val statusType: PromoOfferParticipationStatusFilterType? = null
    ) {

}

