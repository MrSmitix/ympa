package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferCampaignStatusType
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
 * Статус товара в магазине.
 * @param campaignId Идентификатор кампании. 
 * @param status 
 */
data class OfferCampaignStatusDTO(

    @Schema(example = "null", required = true, description = "Идентификатор кампании. ")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: OfferCampaignStatusType
    ) {

}

