@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderTaxSystemType {
    @JsonProperty(value = "OSN") OSN,
    @JsonProperty(value = "USN") USN,
    @JsonProperty(value = "USN_MINUS_COST") USN_MINUS_COST,
    @JsonProperty(value = "ENVD") ENVD,
    @JsonProperty(value = "ECHN") ECHN,
    @JsonProperty(value = "PSN") PSN,
    @JsonProperty(value = "NPD") NPD,
    @JsonProperty(value = "UNKNOWN_VALUE") UNKNOWN_VALUE,
}
