@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedbackStateType {
    @JsonProperty(value = "LAST") LAST,
    @JsonProperty(value = "PREVIOUS") PREVIOUS,
    @JsonProperty(value = "DELETED") DELETED,
}
