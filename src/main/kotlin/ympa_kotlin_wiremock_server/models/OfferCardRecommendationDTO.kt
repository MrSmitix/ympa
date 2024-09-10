@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferCardRecommendationDTO(
    @field:JsonProperty("type")
    val type: OfferCardRecommendationType,

    @field:JsonProperty("percent")
    val percent: kotlin.Int? = null,

)
