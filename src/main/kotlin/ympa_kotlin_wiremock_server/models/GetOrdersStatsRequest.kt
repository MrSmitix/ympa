@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOrdersStatsRequest(
    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate? = null,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate? = null,

    @field:JsonProperty("updateFrom")
    val updateFrom: java.time.LocalDate? = null,

    @field:JsonProperty("updateTo")
    val updateTo: java.time.LocalDate? = null,

    @field:JsonProperty("orders")
    val orders: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("statuses")
    val statuses: kotlin.collections.List<OrderStatsStatusType>? = null,

    @field:JsonProperty("hasCis")
    val hasCis: kotlin.Boolean? = null,

)
