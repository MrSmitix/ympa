@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferRecommendationsResultDTO(
    @field:JsonProperty("offerRecommendations")
    val offerRecommendations: kotlin.collections.List<OfferRecommendationDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
