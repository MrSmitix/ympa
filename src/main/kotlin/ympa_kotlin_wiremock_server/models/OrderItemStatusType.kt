@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderItemStatusType {
    @JsonProperty(value = "REJECTED") REJECTED,
    @JsonProperty(value = "RETURNED") RETURNED,
}
