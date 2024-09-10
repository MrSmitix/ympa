@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetChatHistoryRequest(
    @field:JsonProperty("messageIdFrom")
    val messageIdFrom: kotlin.Long? = null,

)
