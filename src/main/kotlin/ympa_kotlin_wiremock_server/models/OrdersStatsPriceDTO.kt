@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsPriceDTO(
    @field:JsonProperty("type")
    val type: OrdersStatsPriceType? = null,

    @field:JsonProperty("costPerItem")
    val costPerItem: java.math.BigDecimal? = null,

    @field:JsonProperty("total")
    val total: java.math.BigDecimal? = null,

)
