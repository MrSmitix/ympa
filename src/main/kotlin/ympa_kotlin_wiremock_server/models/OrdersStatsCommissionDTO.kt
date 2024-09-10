@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsCommissionDTO(
    @field:JsonProperty("type")
    val type: OrdersStatsCommissionType? = null,

    @field:JsonProperty("actual")
    val `actual`: java.math.BigDecimal? = null,

)
