package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 * @param notDeletedOfferIds Список SKU.
 */
data class DeleteCampaignOffersDTO(

    @Schema(example = "null", description = "Список SKU.")
    @get:JsonProperty("notDeletedOfferIds") val notDeletedOfferIds: kotlin.collections.List<kotlin.String>? = null
    ) {

}

