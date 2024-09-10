@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SendMessageToChatRequest(
    @field:JsonProperty("message")
    val message: kotlin.String,

)
