@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderCancellationReasonType {
    @JsonProperty(value = "ORDER_DELIVERED") DELIVERED,
    @JsonProperty(value = "ORDER_IN_DELIVERY") IN_DELIVERY,
}
