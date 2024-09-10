@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsItemDTO(
    @field:JsonProperty("offerName")
    val offerName: kotlin.String? = null,

    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String? = null,

    @field:JsonProperty("count")
    val count: kotlin.Int? = null,

    @field:JsonProperty("prices")
    val prices: kotlin.collections.List<OrdersStatsPriceDTO>? = null,

    @field:JsonProperty("warehouse")
    val warehouse: OrdersStatsWarehouseDTO? = null,

    @field:JsonProperty("details")
    val details: kotlin.collections.List<OrdersStatsDetailsDTO>? = null,

    @field:JsonProperty("cisList")
    val cisList: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("initialCount")
    val initialCount: kotlin.Int? = null,

    @field:JsonProperty("bidFee")
    val bidFee: kotlin.Int? = null,

    @field:JsonProperty("cofinanceThreshold")
    val cofinanceThreshold: java.math.BigDecimal? = null,

    @field:JsonProperty("cofinanceValue")
    val cofinanceValue: java.math.BigDecimal? = null,

)
