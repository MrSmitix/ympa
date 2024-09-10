@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReportStatusType {
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "PROCESSING") PROCESSING,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "DONE") DONE,
}
