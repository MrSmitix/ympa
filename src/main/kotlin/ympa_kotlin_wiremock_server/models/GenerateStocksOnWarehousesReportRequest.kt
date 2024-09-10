@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateStocksOnWarehousesReportRequest(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("warehouseIds")
    val warehouseIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("reportDate")
    val reportDate: java.time.LocalDate? = null,

    @field:JsonProperty("categoryIds")
    val categoryIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("hasStocks")
    val hasStocks: kotlin.Boolean? = null,

)
