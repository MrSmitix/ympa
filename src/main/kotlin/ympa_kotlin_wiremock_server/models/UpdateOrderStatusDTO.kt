@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOrderStatusDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("status")
    val status: OrderStatusType? = null,

    @field:JsonProperty("substatus")
    val substatus: OrderSubstatusType? = null,

    @field:JsonProperty("updateStatus")
    val updateStatus: OrderUpdateStatusType? = null,

    @field:JsonProperty("errorDetails")
    val errorDetails: kotlin.String? = null,

)
