@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedIndexLogsIndexType {
    @JsonProperty(value = "DIFF") DIFF,
    @JsonProperty(value = "FAST_PRICE") FAST_PRICE,
    @JsonProperty(value = "FULL") FULL,
}
