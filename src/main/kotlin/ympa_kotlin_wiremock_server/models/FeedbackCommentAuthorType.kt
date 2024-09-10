@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedbackCommentAuthorType {
    @JsonProperty(value = "USER") USER,
    @JsonProperty(value = "SHOP") SHOP,
}
