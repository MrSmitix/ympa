@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderStatusType {
    @JsonProperty(value = "PLACING") PLACING,
    @JsonProperty(value = "RESERVED") RESERVED,
    @JsonProperty(value = "UNPAID") UNPAID,
    @JsonProperty(value = "PROCESSING") PROCESSING,
    @JsonProperty(value = "DELIVERY") DELIVERY,
    @JsonProperty(value = "PICKUP") PICKUP,
    @JsonProperty(value = "DELIVERED") DELIVERED,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "PARTIALLY_RETURNED") PARTIALLY_RETURNED,
    @JsonProperty(value = "RETURNED") RETURNED,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
