@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsPaymentDTO(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("date")
    val date: java.time.LocalDate? = null,

    @field:JsonProperty("type")
    val type: OrdersStatsPaymentType? = null,

    @field:JsonProperty("source")
    val source: OrdersStatsPaymentSourceType? = null,

    @field:JsonProperty("total")
    val total: java.math.BigDecimal? = null,

    @field:JsonProperty("paymentOrder")
    val paymentOrder: OrdersStatsPaymentOrderDTO? = null,

)
