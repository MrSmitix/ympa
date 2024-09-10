@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBoxLayoutDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<OrderBoxLayoutItemDTO>,

)
