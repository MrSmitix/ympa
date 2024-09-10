@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOrderItemRequest(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<OrderItemModificationDTO>,

    @field:JsonProperty("reason")
    val reason: OrderItemsModificationRequestReasonType? = null,

)
