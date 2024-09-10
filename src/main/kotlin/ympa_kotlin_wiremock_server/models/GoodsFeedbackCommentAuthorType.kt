@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class GoodsFeedbackCommentAuthorType {
    @JsonProperty(value = "USER") USER,
    @JsonProperty(value = "BUSINESS") BUSINESS,
}
