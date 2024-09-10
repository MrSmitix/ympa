@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsDetailsDTO(
    @field:JsonProperty("itemStatus")
    val itemStatus: OrdersStatsItemStatusType? = null,

    @field:JsonProperty("itemCount")
    val itemCount: kotlin.Long? = null,

    @field:JsonProperty("updateDate")
    val updateDate: java.time.LocalDate? = null,

    @field:JsonProperty("stockType")
    val stockType: OrdersStatsStockType? = null,

)
