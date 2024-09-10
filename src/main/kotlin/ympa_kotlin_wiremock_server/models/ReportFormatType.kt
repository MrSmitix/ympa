@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReportFormatType {
    @JsonProperty(value = "FILE") FILE,
    @JsonProperty(value = "CSV") CSV,
}
