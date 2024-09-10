@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceRecommendationItemDTO(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal,

)
