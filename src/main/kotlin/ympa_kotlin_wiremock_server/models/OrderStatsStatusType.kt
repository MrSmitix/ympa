@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderStatsStatusType {
    @JsonProperty(value = "CANCELLED_BEFORE_PROCESSING") CANCELLED_BEFORE_PROCESSING,
    @JsonProperty(value = "CANCELLED_IN_DELIVERY") CANCELLED_IN_DELIVERY,
    @JsonProperty(value = "CANCELLED_IN_PROCESSING") CANCELLED_IN_PROCESSING,
    @JsonProperty(value = "DELIVERY") DELIVERY,
    @JsonProperty(value = "DELIVERED") DELIVERED,
    @JsonProperty(value = "PARTIALLY_DELIVERED") PARTIALLY_DELIVERED,
    @JsonProperty(value = "PARTIALLY_RETURNED") PARTIALLY_RETURNED,
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "PICKUP") PICKUP,
    @JsonProperty(value = "PROCESSING") PROCESSING,
    @JsonProperty(value = "RESERVED") RESERVED,
    @JsonProperty(value = "RETURNED") RETURNED,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "UNPAID") UNPAID,
    @JsonProperty(value = "LOST") LOST,
}
