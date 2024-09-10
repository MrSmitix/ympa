@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OutletStatusType {
    @JsonProperty(value = "AT_MODERATION") AT_MODERATION,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "MODERATED") MODERATED,
    @JsonProperty(value = "NONMODERATED") NONMODERATED,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
