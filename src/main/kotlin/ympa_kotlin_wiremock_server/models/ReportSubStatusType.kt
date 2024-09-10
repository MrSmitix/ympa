@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReportSubStatusType {
    @JsonProperty(value = "NO_DATA") NO_DATA,
    @JsonProperty(value = "TOO_LARGE") TOO_LARGE,
    @JsonProperty(value = "RESOURCE_NOT_FOUND") RESOURCE_NOT_FOUND,
}
