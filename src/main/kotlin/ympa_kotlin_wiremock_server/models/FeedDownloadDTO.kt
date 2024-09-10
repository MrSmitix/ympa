@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedDownloadDTO(
    @field:JsonProperty("status")
    val status: FeedStatusType? = null,

    @field:JsonProperty("error")
    val error: FeedDownloadErrorDTO? = null,

)
