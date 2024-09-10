@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChatMessageSenderType {
    @JsonProperty(value = "PARTNER") PARTNER,
    @JsonProperty(value = "CUSTOMER") CUSTOMER,
    @JsonProperty(value = "MARKET") MARKET,
    @JsonProperty(value = "SUPPORT") SUPPORT,
}
