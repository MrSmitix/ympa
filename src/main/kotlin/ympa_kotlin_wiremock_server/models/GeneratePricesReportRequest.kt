@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GeneratePricesReportRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long? = null,

    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long? = null,

    @field:JsonProperty("categoryIds")
    val categoryIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("creationDateFrom")
    val creationDateFrom: java.time.LocalDate? = null,

    @field:JsonProperty("creationDateTo")
    val creationDateTo: java.time.LocalDate? = null,

)
