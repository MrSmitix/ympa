@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderItemSubsidyType {
    @JsonProperty(value = "YANDEX_CASHBACK") YANDEX_CASHBACK,
    @JsonProperty(value = "SUBSIDY") SUBSIDY,
}
