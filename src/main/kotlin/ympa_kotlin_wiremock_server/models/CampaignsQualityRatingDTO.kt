@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignsQualityRatingDTO(
    @field:JsonProperty("campaignRatings")
    val campaignRatings: kotlin.collections.List<CampaignQualityRatingDTO>,

)
