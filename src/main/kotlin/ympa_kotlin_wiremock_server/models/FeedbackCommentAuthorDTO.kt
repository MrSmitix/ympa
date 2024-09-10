@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackCommentAuthorDTO(
    @field:JsonProperty("type")
    val type: FeedbackCommentAuthorType? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
