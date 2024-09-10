@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrdersStatsPriceType {
    @JsonProperty(value = "BUYER") BUYER,
    @JsonProperty(value = "CASHBACK") CASHBACK,
    @JsonProperty(value = "MARKETPLACE") MARKETPLACE,
}
