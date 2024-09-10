@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedDownloadErrorDTO(
    @field:JsonProperty("httpStatusCode")
    val httpStatusCode: kotlin.Int? = null,

    @field:JsonProperty("type")
    val type: FeedDownloadErrorType? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
