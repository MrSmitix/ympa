@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnType {
    @JsonProperty(value = "UNREDEEMED") UNREDEEMED,
    @JsonProperty(value = "RETURN") RETURN,
}
