@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatMessagePayloadDTO(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("size")
    val propertySize: kotlin.Int,

)
