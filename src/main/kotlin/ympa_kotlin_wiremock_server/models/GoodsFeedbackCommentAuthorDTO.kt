@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackCommentAuthorDTO(
    @field:JsonProperty("type")
    val type: GoodsFeedbackCommentAuthorType? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
