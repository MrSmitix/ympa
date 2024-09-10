@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class GoodsFeedbackCommentStatusType {
    @JsonProperty(value = "PUBLISHED") PUBLISHED,
    @JsonProperty(value = "UNMODERATED") UNMODERATED,
    @JsonProperty(value = "BANNED") BANNED,
    @JsonProperty(value = "DELETED") DELETED,
}
