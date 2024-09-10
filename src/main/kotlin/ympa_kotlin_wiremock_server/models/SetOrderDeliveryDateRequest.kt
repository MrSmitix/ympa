@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SetOrderDeliveryDateRequest(
    @field:JsonProperty("dates")
    val dates: OrderDeliveryDateDTO,

    @field:JsonProperty("reason")
    val reason: OrderDeliveryDateReasonType,

)
