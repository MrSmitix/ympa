@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsStatsDTO(
    @field:JsonProperty("shopSkus")
    val shopSkus: kotlin.collections.List<GoodsStatsGoodsDTO>,

)
