@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetChatInfoDTO(
    @field:JsonProperty("chatId")
    val chatId: kotlin.Long,

    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("type")
    val type: ChatType,

    @field:JsonProperty("status")
    val status: ChatStatusType,

    @field:JsonProperty("createdAt")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime,

)
