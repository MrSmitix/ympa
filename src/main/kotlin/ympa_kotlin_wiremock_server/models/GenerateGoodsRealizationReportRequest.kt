@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateGoodsRealizationReportRequest(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("year")
    val year: kotlin.Int,

    @field:JsonProperty("month")
    val month: kotlin.Int,

)
