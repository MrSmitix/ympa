@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetWarehouseStocksRequest(
    @field:JsonProperty("withTurnover")
    val withTurnover: kotlin.Boolean? = false,

    @field:JsonProperty("archived")
    val archived: kotlin.Boolean? = null,

    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.Set<kotlin.String>? = null,

)
