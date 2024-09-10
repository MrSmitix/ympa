@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderStateDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("status")
    val status: OrderStatusType,

    @field:JsonProperty("substatus")
    val substatus: OrderSubstatusType? = null,

)
