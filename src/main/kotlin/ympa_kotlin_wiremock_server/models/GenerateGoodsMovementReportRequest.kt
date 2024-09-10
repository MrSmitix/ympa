@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateGoodsMovementReportRequest(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate,

    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String? = null,

)
