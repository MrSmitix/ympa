@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AgeUnitType {
    @JsonProperty(value = "YEAR") YEAR,
    @JsonProperty(value = "MONTH") MONTH,
}
