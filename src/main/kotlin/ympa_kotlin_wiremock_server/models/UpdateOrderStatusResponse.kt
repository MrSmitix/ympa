@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOrderStatusResponse(
    @field:JsonProperty("order")
    val order: OrderDTO? = null,

)
