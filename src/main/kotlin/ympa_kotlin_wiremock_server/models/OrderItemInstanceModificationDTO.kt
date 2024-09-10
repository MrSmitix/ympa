@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemInstanceModificationDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("instances")
    val instances: kotlin.collections.List<BriefOrderItemInstanceDTO>,

)
