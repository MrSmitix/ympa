@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrdersStatsPaymentType {
    @JsonProperty(value = "PAYMENT") PAYMENT,
    @JsonProperty(value = "REFUND") REFUND,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
