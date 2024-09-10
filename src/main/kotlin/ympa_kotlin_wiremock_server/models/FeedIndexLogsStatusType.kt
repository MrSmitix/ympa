@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedIndexLogsStatusType {
    @JsonProperty(value = "ERROR") ERROR,
    @JsonProperty(value = "OK") OK,
    @JsonProperty(value = "WARNING") WARNING,
}
