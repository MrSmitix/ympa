@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignSettingsLocalRegionDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: RegionType? = null,

    @field:JsonProperty("deliveryOptionsSource")
    val deliveryOptionsSource: CampaignSettingsScheduleSourceType? = null,

    @field:JsonProperty("delivery")
    val delivery: CampaignSettingsDeliveryDTO? = null,

)
