@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetBidsRecommendationsResponseDTO(
    @field:JsonProperty("recommendations")
    val recommendations: kotlin.collections.List<SkuBidRecommendationItemDTO>,

)
