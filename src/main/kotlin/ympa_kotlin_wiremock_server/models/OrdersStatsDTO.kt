@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsDTO(
    @field:JsonProperty("orders")
    val orders: kotlin.collections.List<OrdersStatsOrderDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
