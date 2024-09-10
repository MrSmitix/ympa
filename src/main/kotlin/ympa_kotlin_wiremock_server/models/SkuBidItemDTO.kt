@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SkuBidItemDTO(
    @field:JsonProperty("sku")
    val sku: kotlin.String,

    @field:JsonProperty("bid")
    val bid: kotlin.Int,

)
