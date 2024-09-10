@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignQualityRatingDTO(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("ratings")
    val ratings: kotlin.collections.List<QualityRatingDTO>,

)
