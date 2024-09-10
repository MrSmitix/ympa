@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SearchShipmentsRequest(
    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate,

    @field:JsonProperty("statuses")
    val statuses: kotlin.collections.Set<ShipmentStatusType>? = null,

    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.Set<kotlin.Long>? = null,

    @field:JsonProperty("cancelledOrders")
    val cancelledOrders: kotlin.Boolean? = true,

)
