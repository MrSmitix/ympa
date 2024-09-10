@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOrdersResponse(
    @field:JsonProperty("orders")
    val orders: kotlin.collections.List<OrderDTO>,

    @field:JsonProperty("pager")
    val pager: FlippingPagerDTO? = null,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
