@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderStatusChangeDTO(
    @field:JsonProperty("status")
    val status: OrderStatusType,

    @field:JsonProperty("substatus")
    val substatus: OrderSubstatusType? = null,

    @field:JsonProperty("delivery")
    val delivery: OrderStatusChangeDeliveryDTO? = null,

)
