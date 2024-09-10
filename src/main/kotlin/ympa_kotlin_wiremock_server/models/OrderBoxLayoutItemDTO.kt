@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBoxLayoutItemDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("fullCount")
    val fullCount: kotlin.Int? = null,

    @field:JsonProperty("partialCount")
    val partialCount: OrderBoxLayoutPartialCountDTO? = null,

    @field:JsonProperty("instances")
    val instances: kotlin.collections.List<BriefOrderItemInstanceDTO>? = null,

)
