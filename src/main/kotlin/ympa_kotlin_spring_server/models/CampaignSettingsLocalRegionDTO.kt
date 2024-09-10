package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CampaignSettingsDeliveryDTO
import ympa_kotlin_spring_server.models.CampaignSettingsScheduleSourceType
import ympa_kotlin_spring_server.models.RegionType
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
 * Информация о своем регионе магазина.
 * @param id Идентификатор региона.
 * @param name Название региона.
 * @param type 
 * @param deliveryOptionsSource 
 * @param delivery 
 */
data class CampaignSettingsLocalRegionDTO(

    @Schema(example = "null", description = "Идентификатор региона.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название региона.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: RegionType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("deliveryOptionsSource") val deliveryOptionsSource: CampaignSettingsScheduleSourceType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("delivery") val delivery: CampaignSettingsDeliveryDTO? = null
    ) {

}

