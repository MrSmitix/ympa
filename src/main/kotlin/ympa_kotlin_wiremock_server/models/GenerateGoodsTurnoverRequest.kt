@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateGoodsTurnoverRequest(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("date")
    val date: java.time.LocalDate? = null,

)
