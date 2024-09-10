@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedIndexLogsErrorDTO(
    @field:JsonProperty("httpStatusCode")
    val httpStatusCode: kotlin.Int? = null,

    @field:JsonProperty("type")
    val type: FeedIndexLogsErrorType? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
