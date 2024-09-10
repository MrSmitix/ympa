@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehouseOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("stocks")
    val stocks: kotlin.collections.List<WarehouseStockDTO>,

    @field:JsonProperty("turnoverSummary")
    val turnoverSummary: TurnoverDTO? = null,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

)
