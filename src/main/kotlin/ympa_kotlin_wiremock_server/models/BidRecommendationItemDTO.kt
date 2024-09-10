@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidRecommendationItemDTO(
    @field:JsonProperty("bid")
    val bid: kotlin.Int,

    @field:JsonProperty("showPercent")
    val showPercent: kotlin.Long,

)
