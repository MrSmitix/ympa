@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemsModificationResultDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<BriefOrderItemDTO>,

)
