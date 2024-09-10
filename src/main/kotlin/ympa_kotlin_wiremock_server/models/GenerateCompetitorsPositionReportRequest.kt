@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateCompetitorsPositionReportRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long,

    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Long,

    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate,

)
