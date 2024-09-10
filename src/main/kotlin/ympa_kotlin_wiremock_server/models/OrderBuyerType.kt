@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderBuyerType {
    @JsonProperty(value = "PERSON") PERSON,
    @JsonProperty(value = "BUSINESS") BUSINESS,
}
