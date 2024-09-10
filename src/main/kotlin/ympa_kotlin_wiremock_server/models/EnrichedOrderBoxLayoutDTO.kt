@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EnrichedOrderBoxLayoutDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<OrderBoxLayoutItemDTO>,

    @field:JsonProperty("boxId")
    val boxId: kotlin.Long? = null,

)
