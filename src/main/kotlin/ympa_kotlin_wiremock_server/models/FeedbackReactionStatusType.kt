@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedbackReactionStatusType {
    @JsonProperty(value = "ALL") ALL,
    @JsonProperty(value = "NEED_REACTION") NEED_REACTION,
}
