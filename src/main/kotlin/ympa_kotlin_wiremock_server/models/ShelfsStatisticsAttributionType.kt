@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShelfsStatisticsAttributionType {
    @JsonProperty(value = "CLICKS") CLICKS,
    @JsonProperty(value = "SHOWS") SHOWS,
}
