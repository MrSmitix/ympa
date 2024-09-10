@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedbackDeliveryType {
    @JsonProperty(value = "DELIVERY") DELIVERY,
    @JsonProperty(value = "PICKUP") PICKUP,
    @JsonProperty(value = "INSTORE") INSTORE,
}
