@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferRecommendationInfoDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("recommendedCofinancePrice")
    val recommendedCofinancePrice: BasePriceDTO? = null,

    @field:JsonProperty("competitivenessThresholds")
    val competitivenessThresholds: PriceCompetitivenessThresholdsDTO? = null,

)
