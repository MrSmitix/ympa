@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SkuBidRecommendationItemDTO(
    @field:JsonProperty("sku")
    val sku: kotlin.String,

    @field:JsonProperty("bid")
    val bid: kotlin.Int,

    @field:JsonProperty("bidRecommendations")
    val bidRecommendations: kotlin.collections.List<BidRecommendationItemDTO>? = null,

    @field:JsonProperty("priceRecommendations")
    val priceRecommendations: kotlin.collections.List<PriceRecommendationItemDTO>? = null,

)
