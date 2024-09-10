@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehouseStockDTO(
    @field:JsonProperty("type")
    val type: WarehouseStockType,

    @field:JsonProperty("count")
    val count: kotlin.Long,

)
