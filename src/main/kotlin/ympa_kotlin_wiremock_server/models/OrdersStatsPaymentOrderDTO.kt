@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsPaymentOrderDTO(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("date")
    val date: java.time.LocalDate? = null,

)
