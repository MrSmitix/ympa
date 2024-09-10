@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderItemInstanceType {
    @JsonProperty(value = "CIS") CIS,
    @JsonProperty(value = "UIN") UIN,
    @JsonProperty(value = "RNPT") RNPT,
    @JsonProperty(value = "GTD") GTD,
}
