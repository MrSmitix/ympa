@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersShipmentInfoDTO(
    @field:JsonProperty("orderIdsWithLabels")
    val orderIdsWithLabels: kotlin.collections.Set<kotlin.Long>,

    @field:JsonProperty("orderIdsWithoutLabels")
    val orderIdsWithoutLabels: kotlin.collections.Set<kotlin.Long>,

)
