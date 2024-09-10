@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsWarehouseDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
