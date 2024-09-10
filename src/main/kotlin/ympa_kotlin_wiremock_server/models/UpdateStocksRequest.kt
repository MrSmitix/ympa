@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateStocksRequest(
    @field:JsonProperty("skus")
    val skus: kotlin.collections.Set<UpdateStockDTO>,

)
