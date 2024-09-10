@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferForRecommendationDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: BasePriceDTO? = null,

    @field:JsonProperty("cofinancePrice")
    val cofinancePrice: GetPriceDTO? = null,

    @field:JsonProperty("competitiveness")
    val competitiveness: PriceCompetitivenessType? = null,

    @field:JsonProperty("shows")
    val shows: kotlin.Long? = null,

)
