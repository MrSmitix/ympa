@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedContentErrorDTO(
    @field:JsonProperty("type")
    val type: FeedContentErrorType? = null,

)
