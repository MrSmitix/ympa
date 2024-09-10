@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDeliveryEacType {
    @JsonProperty(value = "MERCHANT_TO_COURIER") MERCHANT_TO_COURIER,
    @JsonProperty(value = "COURIER_TO_MERCHANT") COURIER_TO_MERCHANT,
    @JsonProperty(value = "CHECKING_BY_MERCHANT") CHECKING_BY_MERCHANT,
}
