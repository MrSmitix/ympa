@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChatType {
    @JsonProperty(value = "CHAT") CHAT,
    @JsonProperty(value = "ARBITRAGE") ARBITRAGE,
}
