@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PageFormatType {
    @JsonProperty(value = "A7") A7,
    @JsonProperty(value = "A4") A4,
}
