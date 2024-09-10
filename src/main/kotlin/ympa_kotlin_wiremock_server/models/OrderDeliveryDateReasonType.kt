@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDeliveryDateReasonType {
    @JsonProperty(value = "USER_MOVED_DELIVERY_DATES") USER_MOVED_DELIVERY_DATES,
    @JsonProperty(value = "PARTNER_MOVED_DELIVERY_DATES") PARTNER_MOVED_DELIVERY_DATES,
}
