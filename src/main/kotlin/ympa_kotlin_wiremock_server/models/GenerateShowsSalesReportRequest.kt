@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateShowsSalesReportRequest(
    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate,

    @field:JsonProperty("grouping")
    val grouping: ShowsSalesGroupingType,

    @field:JsonProperty("businessId")
    val businessId: kotlin.Long? = null,

    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long? = null,

)
