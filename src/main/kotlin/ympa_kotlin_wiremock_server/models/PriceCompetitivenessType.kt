@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PriceCompetitivenessType {
    @JsonProperty(value = "OPTIMAL") OPTIMAL,
    @JsonProperty(value = "AVERAGE") AVERAGE,
    @JsonProperty(value = "LOW") LOW,
}
