@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PutSkuBidsRequest(
    @field:JsonProperty("bids")
    val bids: kotlin.collections.List<SkuBidItemDTO>,

)
