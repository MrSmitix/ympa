@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDeliveryType {
    @JsonProperty(value = "DELIVERY") DELIVERY,
    @JsonProperty(value = "PICKUP") PICKUP,
    @JsonProperty(value = "POST") POST,
    @JsonProperty(value = "DIGITAL") DIGITAL,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
