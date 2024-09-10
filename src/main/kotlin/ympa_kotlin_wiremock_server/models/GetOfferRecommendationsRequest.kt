@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOfferRecommendationsRequest(
    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("cofinancePriceFilter")
    val cofinancePriceFilter: FieldStateType? = null,

    @field:JsonProperty("recommendedCofinancePriceFilter")
    val recommendedCofinancePriceFilter: FieldStateType? = null,

    @field:JsonProperty("competitivenessFilter")
    val competitivenessFilter: PriceCompetitivenessType? = null,

)
