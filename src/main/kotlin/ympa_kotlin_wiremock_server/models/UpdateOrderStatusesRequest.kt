@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOrderStatusesRequest(
    @field:JsonProperty("orders")
    val orders: kotlin.collections.List<OrderStateDTO>,

)
