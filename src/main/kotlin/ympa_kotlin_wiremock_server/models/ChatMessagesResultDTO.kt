@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatMessagesResultDTO(
    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<ChatMessageDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
