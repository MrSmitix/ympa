@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrdersStatsOrderPaymentType {
    @JsonProperty(value = "CREDIT") CREDIT,
    @JsonProperty(value = "POSTPAID") POSTPAID,
    @JsonProperty(value = "PREPAID") PREPAID,
    @JsonProperty(value = "TINKOFF_CREDIT") TINKOFF_CREDIT,
}
