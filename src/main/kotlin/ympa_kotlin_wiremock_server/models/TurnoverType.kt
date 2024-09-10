@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TurnoverType {
    @JsonProperty(value = "LOW") LOW,
    @JsonProperty(value = "ALMOST_LOW") ALMOST_LOW,
    @JsonProperty(value = "HIGH") HIGH,
    @JsonProperty(value = "VERY_HIGH") VERY_HIGH,
    @JsonProperty(value = "NO_SALES") NO_SALES,
    @JsonProperty(value = "FREE_STORE") FREE_STORE,
}
