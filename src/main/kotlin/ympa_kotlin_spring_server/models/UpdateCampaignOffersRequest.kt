package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdateCampaignOfferDTO
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
 * Запрос на обновление предложений товаров магазина.
 * @param offers Параметры размещения товаров в заданном магазине.
 */
data class UpdateCampaignOffersRequest(

    @field:Valid
    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "Параметры размещения товаров в заданном магазине.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<UpdateCampaignOfferDTO>
    ) {

}

