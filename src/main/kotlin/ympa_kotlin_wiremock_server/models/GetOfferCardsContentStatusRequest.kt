@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOfferCardsContentStatusRequest(
    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.Set<kotlin.String>? = null,

    @field:JsonProperty("cardStatuses")
    val cardStatuses: kotlin.collections.Set<OfferCardStatusType>? = null,

    @field:JsonProperty("categoryIds")
    val categoryIds: kotlin.collections.Set<kotlin.Int>? = null,

)
