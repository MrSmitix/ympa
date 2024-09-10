@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OutletVisibilityType {
    @JsonProperty(value = "HIDDEN") HIDDEN,
    @JsonProperty(value = "VISIBLE") VISIBLE,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
