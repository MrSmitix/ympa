@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferRecommendationDTO(
    @field:JsonProperty("offer")
    val offer: OfferForRecommendationDTO? = null,

    @field:JsonProperty("recommendation")
    val recommendation: OfferRecommendationInfoDTO? = null,

)
