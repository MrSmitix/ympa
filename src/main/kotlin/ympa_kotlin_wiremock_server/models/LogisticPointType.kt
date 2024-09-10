@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LogisticPointType {
    @JsonProperty(value = "WAREHOUSE") WAREHOUSE,
    @JsonProperty(value = "PICKUP_POINT") PICKUP_POINT,
    @JsonProperty(value = "PICKUP_TERMINAL") PICKUP_TERMINAL,
    @JsonProperty(value = "PICKUP_POST_OFFICE") PICKUP_POST_OFFICE,
    @JsonProperty(value = "PICKUP_MIXED") PICKUP_MIXED,
    @JsonProperty(value = "PICKUP_RETAIL") PICKUP_RETAIL,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
