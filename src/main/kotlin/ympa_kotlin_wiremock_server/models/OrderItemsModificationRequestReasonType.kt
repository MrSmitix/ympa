@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderItemsModificationRequestReasonType {
    @JsonProperty(value = "PARTNER_REQUESTED_REMOVE") PARTNER_REQUESTED_REMOVE,
    @JsonProperty(value = "USER_REQUESTED_REMOVE") USER_REQUESTED_REMOVE,
}
