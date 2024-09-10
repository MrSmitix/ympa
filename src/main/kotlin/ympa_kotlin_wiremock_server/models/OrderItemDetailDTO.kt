@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemDetailDTO(
    @field:JsonProperty("itemCount")
    val itemCount: kotlin.Long? = null,

    @field:JsonProperty("itemStatus")
    val itemStatus: OrderItemStatusType? = null,

    @field:JsonProperty("updateDate")
    val updateDate: kotlin.String? = null,

)
