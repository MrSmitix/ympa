@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TimeUnitType {
    @JsonProperty(value = "HOUR") HOUR,
    @JsonProperty(value = "DAY") DAY,
    @JsonProperty(value = "WEEK") WEEK,
    @JsonProperty(value = "MONTH") MONTH,
    @JsonProperty(value = "YEAR") YEAR,
}
