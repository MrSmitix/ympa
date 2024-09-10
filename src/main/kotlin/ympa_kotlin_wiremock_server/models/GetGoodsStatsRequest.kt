@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetGoodsStatsRequest(
    @field:JsonProperty("shopSkus")
    val shopSkus: kotlin.collections.Set<kotlin.String>,

)
