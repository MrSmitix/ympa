@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderLiftType {
    @JsonProperty(value = "NOT_NEEDED") NOT_NEEDED,
    @JsonProperty(value = "MANUAL") MANUAL,
    @JsonProperty(value = "ELEVATOR") ELEVATOR,
    @JsonProperty(value = "CARGO_ELEVATOR") CARGO_ELEVATOR,
    @JsonProperty(value = "FREE") FREE,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
