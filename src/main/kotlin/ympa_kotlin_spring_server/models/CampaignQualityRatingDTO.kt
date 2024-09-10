package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.QualityRatingDTO
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
 * Информация об индексе качества магазина.
 * @param campaignId Идентификатор магазина.
 * @param ratings Список значений индекса качества.
 */
data class CampaignQualityRatingDTO(

    @Schema(example = "null", required = true, description = "Идентификатор магазина.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Список значений индекса качества.")
    @get:JsonProperty("ratings", required = true) val ratings: kotlin.collections.List<QualityRatingDTO>
    ) {

}

