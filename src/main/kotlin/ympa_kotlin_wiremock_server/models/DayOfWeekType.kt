@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class DayOfWeekType {
    @JsonProperty(value = "MONDAY") MONDAY,
    @JsonProperty(value = "TUESDAY") TUESDAY,
    @JsonProperty(value = "WEDNESDAY") WEDNESDAY,
    @JsonProperty(value = "THURSDAY") THURSDAY,
    @JsonProperty(value = "FRIDAY") FRIDAY,
    @JsonProperty(value = "SATURDAY") SATURDAY,
    @JsonProperty(value = "SUNDAY") SUNDAY,
}
