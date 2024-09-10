@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetQualityRatingRequest(
    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.Set<kotlin.Long>,

    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate? = null,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate? = null,

)
