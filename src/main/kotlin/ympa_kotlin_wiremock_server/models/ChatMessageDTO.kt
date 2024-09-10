@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatMessageDTO(
    @field:JsonProperty("messageId")
    val messageId: kotlin.Long,

    @field:JsonProperty("createdAt")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("sender")
    val sender: ChatMessageSenderType,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("payload")
    val payload: kotlin.collections.List<ChatMessagePayloadDTO>? = null,

)
