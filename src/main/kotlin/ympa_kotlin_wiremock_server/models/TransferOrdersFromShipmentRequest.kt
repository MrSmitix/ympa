@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TransferOrdersFromShipmentRequest(
    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.List<kotlin.Long>,

)
