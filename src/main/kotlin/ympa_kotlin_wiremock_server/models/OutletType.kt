@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OutletType {
    @JsonProperty(value = "DEPOT") DEPOT,
    @JsonProperty(value = "MIXED") MIXED,
    @JsonProperty(value = "RETAIL") RETAIL,
    @JsonProperty(value = "NOT_DEFINED") NOT_DEFINED,
}
