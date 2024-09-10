@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedIndexLogsOffersDTO(
    @field:JsonProperty("rejectedCount")
    val rejectedCount: kotlin.Long? = null,

    @field:JsonProperty("totalCount")
    val totalCount: kotlin.Long? = null,

)
