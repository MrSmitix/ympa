@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetQuarantineOffersRequest(
    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("cardStatuses")
    val cardStatuses: kotlin.collections.List<OfferCardStatusType>? = null,

    @field:JsonProperty("categoryIds")
    val categoryIds: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("vendorNames")
    val vendorNames: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

)
